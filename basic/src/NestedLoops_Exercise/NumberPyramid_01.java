package NestedLoops_Exercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currant = 1;
        boolean isBigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (currant > n){
                    isBigger = true;
                    break;
                }
                System.out.print(currant + " ");
                currant++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
            
        }
    }
}
