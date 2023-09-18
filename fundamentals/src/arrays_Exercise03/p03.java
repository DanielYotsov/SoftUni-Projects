package arrays_Exercise03;

import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] pair = scanner.nextLine().split(" ");
            array1[i] = Integer.parseInt(pair[0]);
            array2[i] = Integer.parseInt(pair[1]);
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(array1[i] + " ");
            } else {
                System.out.print(array2[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(array2[i] + " ");
            } else {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}