package Exam_prep;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int literSum = 0;
        double averageDegree = 0;

        for (int i = 1; i <=n ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            int degrees = Integer.parseInt(scanner.nextLine());
            literSum = literSum + liters;
            sum = sum + liters * degrees;
            averageDegree = sum * 1.0 / literSum;
        }
        System.out.printf("Liter: %.2f\n",literSum * 1.0);
        System.out.printf("Degrees: %.2f\n",averageDegree);
        if (averageDegree <38){
            System.out.println("Not good, you should baking!");
        }else if (averageDegree > 42.00){
            System.out.println("Dilution with distilled water!");
        }else {
            System.out.println("Super!");
        }
    }
}
