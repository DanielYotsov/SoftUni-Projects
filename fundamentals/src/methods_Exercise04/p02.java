package methods_Exercise04;

import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        countVowels(input);
        scanner.close();
    }

    public static void countVowels(String str) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                vowelCount++;
            }
        }

        System.out.println(vowelCount);
    }
}