package Exam_Regular;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogfoodInKG = Integer.parseInt(scanner.nextLine());
        double dogfoodInGrams = dogfoodInKG * 1000;
        int dogfoodSum = 0;
        boolean foodIsNotEnough = false;
        String command = scanner.nextLine();
        while (!command.equals("Adopted")){
            int input = Integer.parseInt(command);
            dogfoodSum = dogfoodSum + input;
            command = scanner.nextLine();
            if (dogfoodSum > dogfoodInGrams){
                foodIsNotEnough = true;
            }
        }
        if (foodIsNotEnough){
            System.out.printf("Food is not enough. You need %.0f grams more.", Math.abs(dogfoodSum - dogfoodInGrams));
        }else {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", Math.abs(dogfoodSum - dogfoodInGrams));
        }
    }
}
