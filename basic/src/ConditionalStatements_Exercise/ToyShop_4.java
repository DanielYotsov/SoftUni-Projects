package ConditionalStatements_Exercise;

import java.util.Scanner;

public class ToyShop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        int dollsCount = Integer.parseInt(scanner.nextLine());
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        int bearsCount = Integer.parseInt(scanner.nextLine());
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        int minionsCount = Integer.parseInt(scanner.nextLine());
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]
        int trucksCount = Integer.parseInt(scanner.nextLine());
        int toysCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.
        double profit = puzzlesCount * 2.60 + dollsCount * 3 + bearsCount * 4.10 + minionsCount * 8.20 + trucksCount * 2;
        double discount = 0;
        if (toysCount >= 50)
            discount = profit * 0.25;
        double finalProfit = profit - discount;
        double rent = finalProfit * 0.1;
        double freeMoney = finalProfit - rent;
        double diff = Math.abs(vacationPrice - freeMoney);
        if (freeMoney >= vacationPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else System.out.printf("Not enough money! %.2f lv needed.", diff);
    }
}
