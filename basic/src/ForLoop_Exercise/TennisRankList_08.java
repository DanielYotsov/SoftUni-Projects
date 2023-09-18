package ForLoop_Exercise;

import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//Брой турнири, в които е участвал
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int winCount = 0;
        int w = 0;
        int f = 0;
        int sf = 0;

        for (int i = 1; i <= n; i++) {
            String statusMach = scanner.nextLine();
            switch (statusMach) {
                case "W"://W - ако е победител получава 2000 точки
                    startingPoints = startingPoints + 2000;
                    w = w + 2000;
                    winCount++;
                    break;
                case "F"://F - ако е финалист получава 1200 точки
                    startingPoints = startingPoints + 1200;
                    f = f + 1200;
                    break;
                case "SF"://SF - ако е полуфиналист получава 720 точки
                    startingPoints = startingPoints + 720;
                    sf = sf + 720;
                    break;
            }
        }
        int sumPoint = w + f + sf;
        System.out.printf("Final points: %d\n", startingPoints);
        System.out.printf("Average points: %d\n",sumPoint / n);
        System.out.printf("%.2f%%\n", (winCount * 1.0 / n) * 100);
    }
}
