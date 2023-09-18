package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SummerOutfit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrease = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";
        if (timeOfDay.equals("Morning")){
            if (degrease >=10 && degrease <=18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else  if (degrease >18 && degrease <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degrease >=25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }else if (timeOfDay.equals("Afternoon")){
            if (degrease >=10 && degrease <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else  if (degrease >18 && degrease <=24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if (degrease >=25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }else if (timeOfDay.equals("Evening")){
            if (degrease >=10 && degrease <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else  if (degrease >18 && degrease <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degrease >=25){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrease, outfit, shoes);
    }
}
