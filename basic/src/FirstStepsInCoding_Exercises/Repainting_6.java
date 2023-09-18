package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class Repainting_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        int nylon = Integer.parseInt(scanner.nextLine())+2;
        double nylonPrice = nylon *1.50;

        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        double paint = Double.parseDouble(scanner.nextLine()) * 14.50;
        double paintTotal = paint * 0.1 + paint;

        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        double thinner = Double.parseDouble(scanner.nextLine()) * 5.00;
        double totalMaterials = nylonPrice + paintTotal + thinner + 0.40;
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        double workHours = Double.parseDouble(scanner.nextLine());
        double workPrice = (totalMaterials * 0.3) * workHours;
        double totalPrice = workPrice + totalMaterials;


        System.out.println(totalPrice);
    }
}
