package exam_prep;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        //Max Bonus: 34.
        //The student has attended 24 lectures.
        double maxBonus = 0;
        int maxAttendance = 0;
        for (int i = 0; i < studentsCount; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            double currentBonus = attendance * 1.0 / lecturesCount * (5 + initialBonus);
            if (currentBonus > maxBonus){
                maxBonus = currentBonus;
                maxAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
