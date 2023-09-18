package WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double totalMoney = availableMoney;

        int daysSpend = 0;
        int days = 0;
        boolean spendTooMatch = false;
        while (totalMoney < moneyForVacation){
            days++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "save":
                    daysSpend = 0;
                    totalMoney = totalMoney + money;
                    break;
                case "spend":
                    daysSpend++;
                    totalMoney = totalMoney - money;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
            }
            if (daysSpend == 5){
                spendTooMatch = true;
                break;
            }
        }
        if (spendTooMatch){
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        else{
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
