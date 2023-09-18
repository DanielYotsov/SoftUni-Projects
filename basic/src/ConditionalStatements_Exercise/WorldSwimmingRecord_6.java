package ConditionalStatements_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInS = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double resistance = Math.floor(distance / 15) * 12.5;

        double timeToSwim = distance * timeForMeter;

        double sumTime = timeToSwim + resistance;

        if (sumTime < recordInS){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }else
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(sumTime - recordInS));
    }
}
