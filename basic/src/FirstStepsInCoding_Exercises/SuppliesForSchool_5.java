package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class SuppliesForSchool_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        //•	Брой пакети химикали - цяло число в интервала [0...100]
        double pens = Double.parseDouble(scanner.nextLine()) * 5.80;
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        double markers = Double.parseDouble(scanner.nextLine()) * 7.20;
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        double litres = Double.parseDouble(scanner.nextLine()) * 1.20;
        //•	Процент намаление - цяло число в интервала [0...100]
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double total = pens + markers + litres;
        double totalDiscount = total * percent;
        System.out.println(total - totalDiscount);
    }
}
