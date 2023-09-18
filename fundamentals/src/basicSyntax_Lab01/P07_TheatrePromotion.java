package basicSyntax_Lab01;

import java.util.Scanner;

public class P07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
        //Weekday	     12$	         18$	         12$
        //Weekend	     15$	         20$	         15$
        //Holiday	      5$	         12$	         10$
        String dayOfTheWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        if (dayOfTheWeek.equals("Weekday")) {
            if (age >= 0 && age < 18) {
                System.out.println("12" + "$");
            } else if (age > 64 && age <= 122) {
                System.out.println("12" + "$");
            } else if (age > 18 && age <= 64) {
                System.out.println("18" + "$");
            }else{
                System.out.println("Error!");
            }
        } else if (dayOfTheWeek.equals("Weekend")) {
            if (age >= 0 && age < 18) {
                System.out.println("15" + "$");
            } else if (age > 64 && age <= 122) {
                System.out.println("15" + "$");
            } else if (age > 18 && age <= 64) {
                System.out.println("20" + "$");
            }else{
                System.out.println("Error!");
            }
        } else if (dayOfTheWeek.equals("Holiday")) {
            if (age >= 0 && age < 18) {
                System.out.println("5" + "$");
            } else if (age > 64 && age <= 122) {
                System.out.println("10" + "$");
            } else if (age > 18 && age <= 64) {
                System.out.println("12" + "$");
            }else{
                System.out.println("Error!");
            }
        }
    }
}
