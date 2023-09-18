package WhileLoop_Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goodGradesCount = 0;
        int badGradesCount = 0;
        double gradeSum = 0;
        boolean isFailed = false;

        while (goodGradesCount < 12) {
            double grades = Double.parseDouble(scanner.nextLine());
            if (grades <= 4) {
                badGradesCount++;
            }
            if (badGradesCount > 2) {
                isFailed = true;
                break;
            }
            goodGradesCount++;
            gradeSum = gradeSum + grades;


        }
    if (isFailed){
        System.out.printf("%s has been excluded at %d grade", name, goodGradesCount);
    }else  System.out.printf("%s graduated. Average grade: %.2f", name, gradeSum / goodGradesCount);
    }
}
