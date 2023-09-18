package ConditionalStatements_Exercise;

import java.util.Scanner;

public class BonusScore_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        //•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        //o	За четно число  + 1 т.
        //o	За число, което завършва на 5  + 2 т.
        if (number <= 100){
            bonus = 5;
        } else if (number < 1000){
            bonus = number * 0.20;
        }else if (number > 1000){
            bonus = number * 0.10;
        }
        if (number %2==0){
            bonus = bonus + 1;
        }else if (number %10==5){
            bonus = bonus + 2;
        } System.out.println(bonus);
        System.out.println(number + bonus);

    }
}
