package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());

        int seatSum = rows * colons;

        switch (projectionType) {
            case "Premiere":
                System.out.printf("%.2f", seatSum * 12.00);
                break;
            case "Normal":
                System.out.printf("%.2f", seatSum * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f", seatSum * 5.00);
                break;
        }
    }
}
