package arrays_Exercise03;

import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        int equilibriumIndex = findEquilibriumIndex(array);

        if (equilibriumIndex != -1) {
            System.out.println(equilibriumIndex);
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    public static int findEquilibriumIndex(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < array.length; i++) {
            rightSum -= array[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += array[i];
        }

        return -1;
    }
}