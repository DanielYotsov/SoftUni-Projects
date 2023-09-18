package basicSyntax_Exercise01;

import java.util.Scanner;

public class p04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int currantNum = 0;
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            currantNum = i;
            System.out.print(currantNum + " ");
            sum = sum + currantNum;
        }
        System.out.printf("\nSum: %d",sum);
    }
}
