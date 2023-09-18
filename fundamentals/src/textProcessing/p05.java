package textProcessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (second.equals("0") || first.equals("0")) {
            System.out.println(0);
            return;
        }

        ArrayList<Integer> result = multiplyLargeNumbers(first, second);
        printResult(result);
    }

    private static ArrayList<Integer> multiplyLargeNumbers(String first, String second) {
        ArrayList<Integer> num1 = convertStringToDigits(first);
        ArrayList<Integer> num2 = convertStringToDigits(second);

        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(num1.size() + num2.size(), 0));

        for (int i = num1.size() - 1; i >= 0; i--) {
            for (int j = num2.size() - 1; j >= 0; j--) {
                int product = num1.get(i) * num2.get(j) + result.get(i + j + 1);
                result.set(i + j + 1, product % 10);
                result.set(i + j, result.get(i + j) + product / 10);
            }
        }

        // Remove any leading zeros
        while (!result.isEmpty() && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    private static ArrayList<Integer> convertStringToDigits(String str) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            digits.add(Integer.parseInt(str.substring(i, i + 1)));
        }
        return digits;
    }

    private static void printResult(ArrayList<Integer> result) {
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }
        System.out.println(sb);
    }
}