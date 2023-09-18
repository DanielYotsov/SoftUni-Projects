package arrays_Exercise03;

import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        int startIndex = 0;
        int longestLength = 1;
        int currentLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    startIndex = i - longestLength;
                }
                currentLength = 1;
            }
        }
        if (currentLength > longestLength) {
            longestLength = currentLength;
            startIndex = array.length - longestLength;
        }
        if (longestLength > 1) {
            for (int i = startIndex; i < startIndex + longestLength; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("no");
        }
        scanner.close();
    }
}