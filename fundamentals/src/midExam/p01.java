package midExam;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int playersCount = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());

        double totalWater = daysOfAdventure * playersCount * waterPerDayForOnePerson;
        double totalFood = daysOfAdventure * playersCount * foodPerDayForOnePerson;

        int dayForWater = 0;
        int dayForFood = 0;
        for (int day = 1; day <= daysOfAdventure; day++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());

            groupsEnergy = groupsEnergy - energyLoss;
            if (groupsEnergy <= 0){
                break;
            }
            dayForWater = dayForWater + 1;
            if (dayForWater >= 2) {
                totalWater -= totalWater * 0.3;
                groupsEnergy = groupsEnergy + (groupsEnergy * 0.05);
                dayForWater = 0;
            }
            dayForFood = dayForFood + 1;
            if (dayForFood >= 3){
                totalFood -= totalFood / playersCount;
                groupsEnergy = groupsEnergy + (groupsEnergy * 0.1);
                dayForFood = 0;
            }
        }
        if (groupsEnergy >= 1) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupsEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
