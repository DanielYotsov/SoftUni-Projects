package list_Exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        List<String> dataList = new ArrayList<>(Arrays.asList(data));

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] commandArgs = command.split(" ");
            String operation = commandArgs[0];
            int index = Integer.parseInt(commandArgs[1]);

            if (operation.equals("merge")) {
                int startIndex = Math.max(0, index);
                int endIndex = Math.min(index + 1, dataList.size());
                mergeElements(dataList, startIndex, endIndex);
            } else if (operation.equals("divide")) {
                int partitions = Integer.parseInt(commandArgs[2]);
                divideElement(dataList, index, partitions);
            }

            command = scanner.nextLine();
        }

        String result = String.join(" ", dataList);
        System.out.println(result);
    }

    private static void mergeElements(List<String> dataList, int startIndex, int endIndex) {
        StringBuilder merged = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            merged.append(dataList.get(i));
        }
        if (endIndex > startIndex) {
            dataList.subList(startIndex, endIndex).clear();
        }
        dataList.add(startIndex, merged.toString());
    }

    private static void divideElement(List<String> dataList, int index, int partitions) {
        String element = dataList.get(index);
        int partitionSize = element.length() / partitions;
        int remaining = element.length() % partitions;

        List<String> divided = new ArrayList<>();
        int startPos = 0;
        for (int i = 0; i < partitions; i++) {
            int length = partitionSize + (i < remaining ? 1 : 0);
            String substring = element.substring(startPos, startPos + length);
            divided.add(substring);
            startPos += length;
        }

        dataList.remove(index);
        dataList.addAll(index, divided);
    }
}
