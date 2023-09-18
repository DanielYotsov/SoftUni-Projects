package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class PetShop_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        double dogFood = Double.parseDouble(scanner.nextLine());
        //2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
        double catFood = Double.parseDouble(scanner.nextLine());
        System.out.println( (dogFood * 2.50 + catFood * 4) + " lv");

    }
}
