package Exam_prep;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double multiply = 0;
        double sum = 0;

        for (int a = 1; a <=9 ; a++) {
            for (int b = 9; b <= a; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d <= c; d++) {
                        multiply = a * b * c * d;
                        sum = a + b + c + d;
                        if (multiply / sum == 3 || n%3==0){
                            System.out.print((d * 1000) + (c * 100) + (b * 10) + a);
                        }else System.out.printf("%d%d%d%d",a,b,c,d);

                    }

                }

            }

        }
    }
}
