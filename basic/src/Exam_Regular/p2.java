package Exam_Regular;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double avgHeight = Double.parseDouble(scanner.nextLine());
         double spacecraft = width * length * height;
         double roomVolume = (avgHeight + 0.40) * 2 * 2;
         double people = Math.floor(spacecraft / roomVolume);
         if (people < 3){
             System.out.print("The spacecraft is too small.");
         }else if (people>10){
             System.out.print("The spacecraft is too big.");
         }else {
             System.out.printf("The spacecraft holds %.0f astronauts.", people);
         }

    }
}
