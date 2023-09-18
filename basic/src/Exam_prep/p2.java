package Exam_prep;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Любовно послание - 0.60 лв.
        //•	Восъчна роза - 7.20 лв.
        //•	Ключодържател - 3.60 лв.
        //•	Карикатура - 18.20 лв.
        //•	Късмет изненада - 22 лв.
        double priceForParty = Double.parseDouble(scanner.nextLine());//1.Цена на моминското парти - реално число в интервала [1.00 … 10000.00]

        int love = Integer.parseInt(scanner.nextLine());//2.	Брой любовни послания - цяло число в интервала [0… 1000]

        int roses = Integer.parseInt(scanner.nextLine());//3.	Брой восъчни рози - цяло число в интервала [0 … 1000]

        int keychain = Integer.parseInt(scanner.nextLine());//4.	Брой ключодържатели - цяло число в интервала [0 … 1000]

        int pic = Integer.parseInt(scanner.nextLine());//5.	Брой карикатури - цяло число в интервала [0 … 1000]

        int luck = Integer.parseInt(scanner.nextLine());//6.	Брой късмети изненада - цяло число в интервала [0 … 1000]

        double lovePrice = love * 0.60;
        double rosesPrice = roses * 7.20;
        double keychainPrice = keychain * 3.60;
        double picPrice = pic * 18.20;
        double luckPrice = luck * 22;
        int sumCount = love + roses + keychain + pic + luck;
        double sumPrice = lovePrice + rosesPrice + keychainPrice + picPrice + luckPrice;
        double discountPrice = 0;
        double hosting = 0;
        if (sumCount >= 25){
            discountPrice = sumPrice * 0.65;
        }
        hosting = discountPrice - (discountPrice * 0.10);

        if (hosting > priceForParty){
            System.out.printf("Yes! %.2f lv left.", (hosting) - priceForParty);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(hosting - priceForParty));
        }
    }
}
