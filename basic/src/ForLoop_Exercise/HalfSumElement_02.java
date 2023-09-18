package ForLoop_Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

            if (currentNum > maxNum)
                maxNum = currentNum;
        }
        sum = sum - maxNum;
        if (sum == maxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum - maxNum));
        }
    }
}
