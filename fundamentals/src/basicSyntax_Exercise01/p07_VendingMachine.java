package basicSyntax_Exercise01;

import java.util.Scanner;

public class p07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double coinSum = 0;

        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1.0 && coin != 2.0) {
                System.out.printf("Cannot accept %.2f\n", coin);
            } else {
                coinSum += coin;
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        //"Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
        while (!product.equals("End")) {
            boolean haveMoney = true;
            switch (product) {
                case "Nuts":
                    if (coinSum < 2) {
                        System.out.println("Sorry, not enough money");
                        haveMoney = false;
                    } else {
                        coinSum -= 2;
                    }
                    break;
                case "Water":
                    if (coinSum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        haveMoney = false;
                    }else {
                        coinSum -= 0.7;
                    }
                        break;
                case "Crisps":
                    if (coinSum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        haveMoney = false;
                    }else {
                        coinSum -= 1.5;
                    }
                    break;
                case "Soda":
                    if (coinSum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        haveMoney = false;
                    }else {
                        coinSum -= 0.8;
                    }
                    break;
                case "Coke":
                    if (coinSum < 1) {
                        System.out.println("Sorry, not enough money");
                        haveMoney = false;
                    }else {
                        coinSum -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    haveMoney = false;
                    break;
            }
            if (!haveMoney){
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s\n", product);
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinSum);
    }
}
