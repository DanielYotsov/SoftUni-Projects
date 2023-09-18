package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // T (° F) = T (° C) × 1,8 + 32
        double c = Double.parseDouble(scanner.nextLine());
        double f = (c * 1.8) + 32;
        String sf = String.format("%.2f", f);
        System.out.println(sf);
    }
}
