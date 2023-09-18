package methods_Exercise04;

import java.util.Scanner;

public class p10 {
    public static boolean isTopNumber(int number) {
        boolean hasOddDigit = false;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;

            if (digit % 2 != 0) {
                hasOddDigit = true;
            }

            number /= 10;
        }

        return sumOfDigits % 8 == 0 && hasOddDigit;
    }

    public static void printTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printTopNumbers(n);

        scanner.close();
    }
}