package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class BasketballEquipment_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        int tax = Integer.parseInt(scanner.nextLine());
        double sneakers = tax - (tax * 0.40);
        double uniform = sneakers - (sneakers * 0.20);
        double ball = uniform / 4;
        double acc = ball / 5;
        System.out.println(tax + sneakers + uniform + ball + acc);
    }
}
