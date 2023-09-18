package Exam_Regular;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=locationNumber ; i++) {
            double averageGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysForDigging = Integer.parseInt(scanner.nextLine());
            double totalPerDay = 0;
            for (int j = 1; j <= daysForDigging ; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalPerDay = totalPerDay + goldPerDay;
            }
            double averagePerLocation = totalPerDay / daysForDigging;
            double diff = Math.abs(averageGoldPerDay - averagePerLocation);
            if (averagePerLocation >= averageGoldPerDay){
                System.out.printf("Good job! Average gold per day: %.2f.\n", averagePerLocation);
            }else {
                System.out.printf("You need %.2f gold.\n", diff);
            }
        }
    }
}
