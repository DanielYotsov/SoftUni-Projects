package list_Exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = new ArrayList<>();
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int number : numbers) {
            sequence.add(number);
        }

        int[] bombAndPower = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bombNumber = bombAndPower[0];
        int bombPower = bombAndPower[1];

        while (sequence.contains(bombNumber)) {
            int index = sequence.indexOf(bombNumber);
            int leftBound = Math.max(0, index - bombPower);
            int rightBound = Math.min(sequence.size() - 1, index + bombPower);
            sequence.subList(leftBound, rightBound + 1).clear();
        }

        int sum = 0;
        for (int number : sequence) {
            sum += number;
        }

        System.out.println(sum);
    }
}