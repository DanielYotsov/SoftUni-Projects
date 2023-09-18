package ForLoop_Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double birthdayMoney = 0;
        double giftedMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i %2==0) {
                giftedMoney += 10;
                birthdayMoney = birthdayMoney + giftedMoney - 1;
            }else
                toyCount ++;

        }
        double totalMoney = (toyCount * toyPrice) + birthdayMoney;
        if (totalMoney < washMachinePrice){
            System.out.printf("No! %.2f",Math.abs(totalMoney - washMachinePrice));
        }else if (totalMoney >= washMachinePrice){
            System.out.printf("Yes! %.2f",Math.abs(totalMoney - washMachinePrice));
        }

    }
}
