package methods_Exercise04;

import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);

        printCharactersInRange(start, end);

        scanner.close();
    }
    public static void printCharactersInRange(char start, char end) {
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        for (char c = (char) (start + 1); c < end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}