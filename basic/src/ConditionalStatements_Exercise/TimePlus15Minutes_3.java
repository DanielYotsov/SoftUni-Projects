package ConditionalStatements_Exercise;

import java.util.Scanner;

public class TimePlus15Minutes_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hourInMin = hour * 60;
        int totalTimeInMin = hourInMin + minutes + 15;
        int exitHour = totalTimeInMin / 60;
        int exitMin = (totalTimeInMin % 60);
        if (exitHour >23) {
            exitHour = 0;
            //System.out.printf("%d:%02d", exitHour,exitMin);
        }System.out.printf("%d:%02d", exitHour,exitMin);

    }
}
