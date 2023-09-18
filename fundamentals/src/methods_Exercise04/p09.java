package methods_Exercise04;

import java.util.Scanner;

public class p09 {public static boolean isPalindrome(int number) {
    int reverse = 0;
    int original = number;

    while (number != 0) {
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        number /= 10;
    }

    return original == reverse;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("END")) {
                try {
                    int number = Integer.parseInt(input);

                    if (number > 0) {
                        boolean isPalindrome = isPalindrome(number);
                        System.out.println(isPalindrome);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a positive integer or 'END' to exit.");
                }
            }
        } while (!input.equalsIgnoreCase("END"));

        scanner.close();
    }
}