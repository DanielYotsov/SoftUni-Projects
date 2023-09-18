package FirstStepsInCoding_MoreExercises;

import java.util.Scanner;

public class TriangleArea_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //area=a*ha/2
        double a = Double.parseDouble(scanner.nextLine());
        double ha = Double.parseDouble(scanner.nextLine());
        double area =(a * ha)/2;
        String ar = String.format("%.2f", area);
        System.out.println(ar);
    }
}
