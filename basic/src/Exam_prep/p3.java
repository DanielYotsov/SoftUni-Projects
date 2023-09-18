package Exam_prep;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double vacationPrice = 0;

        switch (season){
            case "spring":
                if (peopleCount <=5){
                    vacationPrice = peopleCount * 50;
                }else {
                    vacationPrice = peopleCount * 48;
                }
                break;
            case "summer":
                if (peopleCount <=5){
                    vacationPrice = (peopleCount * 48.5) * 0.85;
                }else {
                    vacationPrice = (peopleCount * 45) * 0.85;
                }
                break;
            case"autumn":
                if (peopleCount <=5){
                    vacationPrice = peopleCount * 60;
                }else {
                    vacationPrice = peopleCount * 49.5;
                }
                break;
            case "winter":
                if (peopleCount <=5){
                    vacationPrice = (peopleCount * 86) * 1.08;
                }else {
                    vacationPrice = (peopleCount * 85) * 1.08;
                }
                break;
        }
        System.out.printf("%.2f leva.", vacationPrice);
    }
}
