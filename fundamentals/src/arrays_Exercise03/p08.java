package arrays_Exercise03;

import java.util.HashSet;
import java.util.Scanner;


public class p08 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] inputArr = scanner.nextLine().split(" ");
    int[] arr = new int[inputArr.length];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(inputArr[i]);
    }
    int targetSum = scanner.nextInt();

    findPairs(arr, targetSum);
}

    public static void findPairs(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (set.contains(complement)) {
                System.out.println(complement + " " + num);
            }
            set.add(num);
        }
    }
}