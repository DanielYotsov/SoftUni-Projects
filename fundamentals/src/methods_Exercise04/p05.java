package methods_Exercise04;

import java.util.Scanner;

public class p05 {
    public static int sum(int num1, int num2) {
    return num1 + num2;
}
    public static int subtract(int result, int num3) {
        return result - num3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sumResult = sum(num1, num2);
        int finalResult = subtract(sumResult, num3);

        System.out.println(finalResult);
    }
}