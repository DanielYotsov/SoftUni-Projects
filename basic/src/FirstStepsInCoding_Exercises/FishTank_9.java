package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class FishTank_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000]
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        double busy = Double.parseDouble(scanner.nextLine()) / 100;
        double xyz = x * y * z;
        double litres = xyz / 1000;
        double litresBusy = litres * busy;
        double totalLitres = litres - litresBusy;
        System.out.println(totalLitres);

    }
}
