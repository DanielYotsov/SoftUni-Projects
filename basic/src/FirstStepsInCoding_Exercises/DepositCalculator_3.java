package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class DepositCalculator_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        double deposit = Double.parseDouble(scanner.nextLine());
        //2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        int mounts = Integer.parseInt(scanner.nextLine());
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
        double percent = Double.parseDouble(scanner.nextLine());
        System.out.println(deposit + mounts * (deposit * percent / 100) / 12);
    }
}
