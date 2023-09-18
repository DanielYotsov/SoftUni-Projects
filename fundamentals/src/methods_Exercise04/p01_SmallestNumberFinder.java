package methods_Exercise04;

import java.util.Scanner;

public class p01_SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        findSmallestNumber(num1, num2, num3);
    }

    public static void findSmallestNumber(int a, int b, int c) {
        int smallest = a; // Assume the first number is the smallest

        // Check if the second number is smaller
        if (b < smallest) {
            smallest = b;
        }

        // Check if the third number is smaller
        if (c < smallest) {
            smallest = c;
        }

        // Print the smallest number
        System.out.println(smallest);
    }
}