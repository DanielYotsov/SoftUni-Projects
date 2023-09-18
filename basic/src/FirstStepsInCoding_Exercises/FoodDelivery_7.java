package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class FoodDelivery_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        int chicken = Integer.parseInt(scanner.nextLine());
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        int fish = Integer.parseInt(scanner.nextLine());
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
        int vegetarian = Integer.parseInt(scanner.nextLine());
          double allMenu = ((chicken * 10.35) + (fish * 12.40) + (vegetarian * 8.15));
          double desert = allMenu * 0.20;
          double delivery = 2.50;

              System.out.println(allMenu + desert + delivery);
    }
}
