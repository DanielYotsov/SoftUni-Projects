package Exam_Regular;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pastries = scanner.nextLine();
        int orderedPastries = Integer.parseInt(scanner.nextLine());
        int dayOfDecemberBeforeChristmas = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double total = 0;


        if (dayOfDecemberBeforeChristmas <= 15){
            switch (pastries){
                case "Cake":
                    price = orderedPastries * 24.00;
                    total = price - (price *0.10);
                    break;
                case "Souffle":
                    price = orderedPastries * 6.66;
                    total = price - (price * 0.10);
                    break;
                case "Baklava":
                    price = orderedPastries * 12.60;
                    total = price - (price *0.10);
                    break;
            }
        }else if (dayOfDecemberBeforeChristmas > 15){
            switch (pastries){
                case "Cake":
                    total = orderedPastries * 28.70;
                    break;
                case "Souffle":
                    total = orderedPastries * 9.80;
                    break;
                case "Baklava":
                    total = orderedPastries * 16.98;
                    break;
            }
        }
        if (dayOfDecemberBeforeChristmas <=22) {
            if (total >= 100 && total <= 200) {
                total = total - (total * 0.15);
            } else if (total > 200) {
                total = total - (total * 0.25);
            }
        }

        System.out.printf("%.2f", total);



    }
}


