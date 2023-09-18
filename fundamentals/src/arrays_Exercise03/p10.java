package arrays_Exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|")));
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandArgs = command.split(" ");
            String action = commandArgs[0];

            switch (action) {
                case "Loot":
                    for (int i = 1; i < commandArgs.length; i++) {
                        String item = commandArgs[i];
                        if (!treasureChest.contains(item)) {
                            treasureChest.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArgs[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String itemToDrop = treasureChest.remove(index);
                        treasureChest.add(itemToDrop);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArgs[1]);
                    if (count >= treasureChest.size()) {
                        System.out.println(String.join(", ", treasureChest));
                        treasureChest.clear();
                    } else {
                        List<String> stolenItems = new ArrayList<>();
                        int startIndex = treasureChest.size() - count;
                        for (int i = treasureChest.size() - 1; i >= startIndex; i--) {
                            stolenItems.add(0, treasureChest.remove(i));
                        }
                        System.out.println(String.join(", ", stolenItems));
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        if (treasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageGain = calculateAverageGain(treasureChest);
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }

    private static double calculateAverageGain(List<String> treasureChest) {
        int totalLength = 0;
        for (String item : treasureChest) {
            totalLength += item.length();
        }
        return (double) totalLength / treasureChest.size();
    }
}