package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double budget = Double.parseDouble(scanner.nextLine());
         String season = scanner.nextLine();

         String destination = "";
         String overnightStay = "";
         double moneySpend = 0;

         if (budget <= 100) {
             destination = "Bulgaria";
             switch (season) {
                 case ("summer"):
                     overnightStay = "Camp";
                     moneySpend = budget * 0.30;
                     break;
                 case ("winter"):
                     overnightStay = "Hotel";
                     moneySpend = budget * 0.70;
                     break;
             }
         }else if (budget <= 1000) {
             destination = "Balkans";
             switch (season) {
                 case ("summer"):
                     overnightStay = "Camp";
                     moneySpend = budget * 0.40;
                     break;
                 case ("winter"):
                     overnightStay = "Hotel";
                     moneySpend = budget * 0.80;
                     break;
             }
         }else if (budget > 1000) {
             destination = "Europe";
             switch (season) {
                 case ("summer"):
                 case ("winter"):
                     overnightStay = "Hotel";
                     moneySpend = budget * 0.90;

                     break;
             }
         }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", overnightStay, moneySpend);
    }
}
