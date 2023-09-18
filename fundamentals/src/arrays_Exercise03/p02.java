package arrays_Exercise03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        ArrayList<String> commonElements = findCommonElements(array1, array2);

        for (String element : commonElements) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    public static ArrayList<String> findCommonElements(String[] array1, String[] array2) {
        ArrayList<String> commonElements = new ArrayList<>();

        HashSet<String> set = new HashSet<>(Arrays.asList(array1));

        for (String element : array2) {
            if (set.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }
}