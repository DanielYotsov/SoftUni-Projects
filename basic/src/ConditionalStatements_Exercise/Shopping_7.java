package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Shopping_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        double budget = Double.parseDouble(scanner.nextLine());
        //2.	Броят видеокарти - цяло число в интервала [0…100]
        int video = Integer.parseInt(scanner.nextLine());
        //3.	Броят процесори - цяло число в интервала [0…100]
        int cpu = Integer.parseInt(scanner.nextLine());
        //4.	Броят рам памет - цяло число в интервала [0…100]
        int ram = Integer.parseInt(scanner.nextLine());
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double videoPrice = video * 250;
        double cpuPrice = cpu * (videoPrice * 0.35);
        double ramPrice = ram * (videoPrice * 0.10);
        double sumPrice = videoPrice + cpuPrice + ramPrice;

        double discount = 0;
        if (video > cpu)
            discount = sumPrice * 0.15;
        double total = sumPrice - discount;

        if (total <= budget) {
            System.out.printf("You have %.2f leva left!", Math.abs(budget - total));
        }else System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget - total));
    }
}
