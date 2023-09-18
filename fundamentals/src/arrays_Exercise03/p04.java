package arrays_Exercise03;

import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        int rotations = scanner.nextInt();

        int[] array = new int[elements.length];

        // Parse the input elements into integer array
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        rotateArray(array, rotations);

        printArray(array);

        scanner.close();
    }

    public static void rotateArray(int[] array, int rotations) {
        for (int i = 0; i < rotations; i++) {
            int temp = array[0];

            // Shift elements to the left
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}