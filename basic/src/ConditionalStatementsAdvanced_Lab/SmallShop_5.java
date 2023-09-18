package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class SmallShop_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//град продукт	coffee	water	beer	sweets	peanuts
//Sofia	        0.50	0.80	1.20	1.45	1.60
//Plovdiv       0.40	0.70	1.15	1.30	1.50
//Varna         0.45	0.70	1.10	1.35	1.55

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.1f",quantity * 0.50);
                        break;
                    case "Plovdiv":
                        System.out.printf("%.1f",quantity * 0.40);
                        break;
                    case "Varna":
                        System.out.printf("%.1f",quantity * 0.45);
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.1f",quantity * 0.80);
                        break;
                    case "Plovdiv":
                        System.out.printf("%.1f",quantity * 0.70);
                        break;
                    case "Varna":
                        System.out.printf("%.1f",quantity * 0.70);
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.1f",quantity * 1.20);
                        break;
                    case "Plovdiv":
                        System.out.printf("%.1f",quantity * 1.15);
                        break;
                    case "Varna":
                        System.out.printf("%.1f",quantity * 1.10);
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.5f",quantity * 1.45);
                        break;
                    case "Plovdiv":
                        System.out.printf("%.5f",quantity * 1.30);
                        break;
                    case "Varna":
                        System.out.printf("%.5f",quantity * 1.35);
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        System.out.printf("%.1f",quantity * 1.60);
                        break;
                    case "Plovdiv":
                        System.out.printf("%.1f",quantity * 1.50);
                        break;
                    case "Varna":
                        System.out.printf("%.1f",quantity * 1.55);
                        break;
                }
                break;
        }
    }
}