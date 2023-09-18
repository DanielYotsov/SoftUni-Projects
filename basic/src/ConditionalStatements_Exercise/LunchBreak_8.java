package ConditionalStatements_Exercise;

import java.util.Scanner;

public class LunchBreak_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String show = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double eat = breakTime / 8.0;
        double relax = breakTime / 4.0;
        double timeLeft = breakTime - eat - relax;

        double diff = Math.abs(timeLeft - episodeTime);
        if (timeLeft >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", show ,Math.ceil(diff));
        }else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", show ,Math.ceil(diff));
    }
}
