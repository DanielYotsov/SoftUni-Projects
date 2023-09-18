package ForLoop_Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (!(i %2==0)){
                evenSum = evenSum + currentNum;
            }if (i %2==0){
                oddSum = oddSum + currentNum;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(evenSum-oddSum));
        }
    }
}
