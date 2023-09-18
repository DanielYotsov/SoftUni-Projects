package arrays_Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArgs = command.split("\\s+");
            String action = commandArgs[0];

            switch (action) {
                case "swap":
                    int index1 = Integer.parseInt(commandArgs[1]);
                    int index2 = Integer.parseInt(commandArgs[2]);
                    swapElements(array, index1, index2);
                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandArgs[1]);
                    int multiplyIndex2 = Integer.parseInt(commandArgs[2]);
                    multiplyElements(array, multiplyIndex1, multiplyIndex2);
                    break;
                case "decrease":
                    decreaseElements(array);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(arrayToString(array));
    }

    private static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void multiplyElements(int[] array, int index1, int index2) {
        array[index1] *= array[index2];
    }

    private static void decreaseElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}