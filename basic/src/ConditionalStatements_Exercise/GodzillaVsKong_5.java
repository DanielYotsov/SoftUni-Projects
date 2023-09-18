package ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzillaVsKong_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statCount = Integer.parseInt(scanner.nextLine());
        double priceWear = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double statSum = statCount * priceWear;
        if (statCount >= 150)
           statSum = statSum - (statSum * 0.10);
        double sumPrice = decor + statSum;
        double diff = Math.abs(budget - sumPrice);
        if (sumPrice > budget) {
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.", diff);
        }else if (sumPrice <= budget)
            System.out.printf("Action! %nWingard starts filming with %.2f leva left." , diff);
    }
}
