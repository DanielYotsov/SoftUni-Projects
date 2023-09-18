package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class TrapeziodArea_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = (b1 + b2) * (h / 2);
        String ar = String.format("%.2f", area);
        System.out.println(ar);
    }
}
