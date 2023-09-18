package dataTypesAndVariables_Exercise02;

import java.util.Scanner;

public class p03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil( people*1.0 / capacity);
        System.out.println(courses);
    }
}
