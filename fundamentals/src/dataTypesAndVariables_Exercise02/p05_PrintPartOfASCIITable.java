package dataTypesAndVariables_Exercise02;

import java.util.Scanner;

public class p05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {

            System.out.print((char)i + " ");
        }
    }
}
