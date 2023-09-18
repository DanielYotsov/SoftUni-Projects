package methods_Exercise04;

import java.util.Scanner;

public class p08 {
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        long factorial1 = calculateFactorial(num1);
        long factorial2 = calculateFactorial(num2);

        double divisionResult = (double) factorial1 / factorial2;

        System.out.printf("%.2f%n", divisionResult);

        scanner.close();
    }
}