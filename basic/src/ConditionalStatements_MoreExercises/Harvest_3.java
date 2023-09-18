package ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class Harvest_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = x * y;
        double grapesForWine = (0.4 * totalGrape) / 2.5;
        double remainingWine = Math.ceil(grapesForWine - z);
        double lack = Math.floor(z - grapesForWine);
        double littersPerson = Math.ceil(remainingWine / workers);
        
        if (grapesForWine < z){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", lack);
        }else if (grapesForWine > z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" , grapesForWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", grapesForWine, littersPerson);
        }

    }
}
