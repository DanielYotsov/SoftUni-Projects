package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class VegetableMarket_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        double priceV = Double.parseDouble(scanner.nextLine());
        double priceF = Double.parseDouble(scanner.nextLine());
        double sumV = Double.parseDouble(scanner.nextLine());
        double sumF = Double.parseDouble(scanner.nextLine());
        double sumVF = ((sumV * priceV) + (sumF * priceF)) / 1.94;
       // String sf = String.format("%.2f", sumVF);
        System.out.printf("%.2f", sumVF);

    }
}
