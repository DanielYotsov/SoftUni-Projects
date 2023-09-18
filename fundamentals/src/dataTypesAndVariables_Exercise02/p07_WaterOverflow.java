package dataTypesAndVariables_Exercise02;

import java.util.Scanner;

public class p07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int numbersOfLines = Integer.parseInt(scanner.nextLine());
        int sumWater = 0;

        for (int i = 0; i < numbersOfLines; i++) {
            int quantities = scanner.nextInt();
            sumWater += quantities;
            if (sumWater > capacity){
                sumWater -= quantities;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sumWater);
    }
}
