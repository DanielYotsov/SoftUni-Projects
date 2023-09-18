package NestedLoops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//хора в журито.
        String input = scanner.nextLine();
        int countAllGrades = 0;
        double avgAllGrades = 0;
        while (!input.equals("Finish")){
            String Presentation = input;
            double sumScore = 0;
            for (int i = 1; i <= n; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumScore = sumScore + score;
            }
            avgAllGrades = avgAllGrades + sumScore;
            double avgScore = sumScore / n;
            System.out.printf("%s - %.2f.\n", Presentation , avgScore);


            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",avgAllGrades/ countAllGrades);
    }
}
