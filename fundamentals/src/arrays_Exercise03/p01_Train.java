package arrays_Exercise03;

import java.util.Scanner;

public class p01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] train = new int[n];
        int totalPeople = 0;

        for (int i = 0; i < n; i++) {
            int peopleCount = scanner.nextInt();
            train[i] = peopleCount;
            totalPeople += peopleCount;
        }

        for (int count : train) {
            System.out.print(count + " ");
        }
        System.out.println();
        System.out.println(totalPeople);

        scanner.close();


    }
}
