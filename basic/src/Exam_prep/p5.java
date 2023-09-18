package Exam_prep;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int baseCamp = 5364;
        int days = 1;
        boolean everestNotReached = false;
        boolean everestReached = false;

        while (!command.equals("END")){

            int meters = Integer.parseInt(scanner.nextLine());
            if (command.equals("Yes")){
                baseCamp =baseCamp + meters;
                if (baseCamp > 8848){
                    everestReached = true;
                    break;
                }
                days++;
            }else if(command.equals("No")) {
                baseCamp =baseCamp + meters;
                if (baseCamp > 8848){
                    everestReached = true;
                    break;
                }
            }
            if (days>=5){
                everestNotReached = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (baseCamp > 8848 || everestReached){
            System.out.printf("Goal reached for %d days!",++days);
        }else if (baseCamp< 8848 || everestNotReached){
            System.out.println("Failed!");
            System.out.print(baseCamp);
        }
    }
}
