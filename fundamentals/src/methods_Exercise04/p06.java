package methods_Exercise04;

import java.util.Scanner;

public class p06 {
    public static void printMiddleCharacter(String str) {
    int length = str.length();
    int middleIndex = length / 2;

    if (length % 2 == 0) {
        // Even length: print two middle characters
        System.out.println("" + str.charAt(middleIndex - 1) + str.charAt(middleIndex));
    } else {
        // Odd length: print the middle character
        System.out.println("" + str.charAt(middleIndex));
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }
}