package arrays_Exercise03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        List<Integer> topIntegers = findTopIntegers(array);
        for (int topInteger : topIntegers) {
            System.out.print(topInteger + " ");
        }
        scanner.close();
    }
    public static List<Integer> findTopIntegers(int[] array) {
        List<Integer> topIntegers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                topIntegers.add(array[i]);
            }
        }
        return topIntegers;
    }
}