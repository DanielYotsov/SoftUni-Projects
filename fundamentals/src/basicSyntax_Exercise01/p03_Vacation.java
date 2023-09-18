package basicSyntax_Exercise01;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (typeGroup) {
            case "ObjectsAndClasses_Exercise06/Students":
                if (day.equals("Friday")) {
                    price = 8.45;

                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                if (countStudents >= 30) {
                    price = price * 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }
                if (countStudents >= 100) {
                    countStudents = countStudents - 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                if (countStudents >= 10 && countStudents <= 20) {
                    price = price * 0.95;

                }
                break;
        }
        double totalPrice = countStudents * price;
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
