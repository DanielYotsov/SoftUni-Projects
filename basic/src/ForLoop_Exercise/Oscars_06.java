package ForLoop_Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();  //Име на актьора
        double academyPoints = Double.parseDouble(scanner.nextLine());  //Точки от академията - реално число в интервала
        int judgesCount = Integer.parseInt(scanner.nextLine());  //Брой оценяващи n - цяло число в интервала

        double pointsToWin = 1250.5;


        for (int i = 1; i <=judgesCount ; i++) {
            String judgeName = scanner.nextLine();  //Име на оценяващия
            double judgePoints = Double.parseDouble(scanner.nextLine());  //Точки от оценяващия - реално число в интервала

            double pointsGiven = ((judgeName.length() * judgePoints) / 2);
            academyPoints += pointsGiven;
            if (academyPoints >= pointsToWin){
                break;
            }
        }
        if (academyPoints < pointsToWin ){
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(academyPoints - pointsToWin));
        }else if (academyPoints > pointsToWin){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName, academyPoints);
        }

    }
}
