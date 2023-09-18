package WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int badGradeCount = 0;
        int score = 0;
        int problemsCount = 0;
        boolean isFailed = false;
        String lastProblem = "";

        while (!command.equals("Enough")) {
            String currantProblem = command;
            int grade = Integer.parseInt(scanner.nextLine());
            lastProblem = command;
            problemsCount++;
            if (grade <= 4) {
                badGradeCount++;
            }
            score = score + grade;
            if (badGradeCount >= maxBadGrades) {
                isFailed = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGradeCount);
        }else {
            System.out.printf("Average score: %.2f\n", score * 1.0 / problemsCount);
            System.out.printf("Number of problems: %d\n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
