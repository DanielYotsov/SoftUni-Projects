package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class FishingBoat_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int groupBudget = Integer.parseInt(scanner.nextLine());
         String season = scanner.nextLine();
         int fishers = Integer.parseInt(scanner.nextLine());

         double totalPrice = 0;

         if (season.equals("Spring")){//Цената за наем на кораба през пролетта е  3000 лв.
             totalPrice = 3000;
             if (fishers <= 6){//отстъпка от 10%
                 totalPrice = totalPrice - (totalPrice * 0.10);
             }else if (fishers > 7 && fishers <=11){//отстъпка от 15%
                 totalPrice = totalPrice - (totalPrice * 0.15);
             }else if (fishers >=12){//отстъпка от 25%
                 totalPrice = totalPrice - (totalPrice * 0.25);
             }

         }else if (season.equals("Summer")){//Цената за наем на кораба през лятото и есента е  4200 лв.
             totalPrice = 4200;
             if (fishers <= 6){//отстъпка от 10%
                 totalPrice = totalPrice - (totalPrice * 0.10);
             }else if (fishers > 7 && fishers <=11){//отстъпка от 15%
                 totalPrice = totalPrice - (totalPrice * 0.15);
             }else if (fishers >=12){//отстъпка от 25%
                 totalPrice = totalPrice - (totalPrice * 0.25);
             }
         }else if (season.equals("Autumn")){//Цената за наем на кораба през лятото и есента е  4200 лв.
             totalPrice = 4200;
             if (fishers <= 6){//отстъпка от 10%
                 totalPrice = totalPrice - (totalPrice * 0.10);
             }else if (fishers > 7 && fishers <=11){//отстъпка от 15%
                 totalPrice = totalPrice - (totalPrice * 0.15);
             }else if (fishers >=12){//отстъпка от 25%
                 totalPrice = totalPrice - (totalPrice * 0.25);
             }
         }else if (season.equals("Winter")){//Цената за наем на кораба през зимата е  2600 лв.
             totalPrice = 2600;
             if (fishers <= 6){//отстъпка от 10%
                 totalPrice = totalPrice - (totalPrice * 0.10);
             }else if (fishers > 7 && fishers <=11){//отстъпка от 15%
                 totalPrice = totalPrice - (totalPrice * 0.15);
             }else if (fishers >=12){//отстъпка от 25%
                 totalPrice = totalPrice - (totalPrice * 0.25);
             }
         }
         if (fishers %2==0 && !season.equals("Autumn")){//Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
             totalPrice = totalPrice - (totalPrice * 0.05);
         }
         if (totalPrice <= groupBudget){
             System.out.printf("Yes! You have %.2f leva left.",Math.abs(groupBudget - totalPrice));
         }else if (totalPrice > groupBudget){
             System.out.printf("Not enough money! You need %.2f leva.",Math.abs(totalPrice - groupBudget));
         }

    }
}
