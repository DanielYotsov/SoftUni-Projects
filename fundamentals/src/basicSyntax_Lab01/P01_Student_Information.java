package basicSyntax_Lab01;

import java.util.Scanner;

public class P01_Student_Information {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Name: John, Age: 15, Grade: 5.40
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, avgGrade);

    }
}
