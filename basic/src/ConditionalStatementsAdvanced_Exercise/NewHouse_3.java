package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerKind = scanner.nextLine();
        double flowerCount = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double totalPrise = 0;

        switch (flowerKind) {
            case "Roses":
                totalPrise = flowerCount * 5;
                if (flowerCount > 80) {
                    totalPrise = totalPrise - (totalPrise * 0.10);
                }
                break;

            case "Dahlias":
                totalPrise = flowerCount * 3.80;
                if (flowerCount > 90) {
                    totalPrise = totalPrise - (totalPrise * 0.15);
                }
                break;

            case "Tulips":
                totalPrise = flowerCount * 2.80;
                if (flowerCount > 80) {
                    totalPrise = totalPrise - (totalPrise * 0.15);
                }
                break;

            case "Narcissus":
                totalPrise = flowerCount * 3;
                if (flowerCount < 120){
                    totalPrise = totalPrise + (totalPrise * 0.15);
                }
                break;

            case "Gladiolus":
                totalPrise = flowerCount * 2.50;
                if (flowerCount < 80) {
                    totalPrise = totalPrise + (totalPrise * 0.20);
                }
                break;
        }
        if (totalPrise <=budget) {
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowerCount, flowerKind, budget - totalPrise);
        }else System.out.printf("Not enough money, you need %.2f leva more.",totalPrise - budget);
    }
}
