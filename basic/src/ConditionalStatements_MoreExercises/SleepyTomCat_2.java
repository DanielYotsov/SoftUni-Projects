package ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class SleepyTomCat_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //За да се наспи добре, нормата за игра на Том е 30 000  минути в година.
        int norm = 30000;
        int dayOff= Integer.parseInt(scanner.nextLine());
        int working = 365 - dayOff;
        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
        int playTime = dayOff * 127 + working * 63;
        int hour = Math.abs(norm - playTime) / 60;
        int min = Math.abs(norm - playTime) % 60;
        if (playTime > norm){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hour, min);
        } else if (playTime < norm){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour, min);

        }


    }
}
