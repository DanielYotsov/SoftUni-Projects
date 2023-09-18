package NestedLoops_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            String currantNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currantNum.length(); j++) {
                int currantDigit = Integer.parseInt("" + currantNum.charAt(j));
                if (j % 2 ==0){
                    evenSum += currantDigit;
                }else {
                    oddSum += currantDigit;
                }
            }
            if (oddSum == evenSum){
                System.out.print(i + " ");
            }

        }
    }
}
