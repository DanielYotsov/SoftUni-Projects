package textProcessing;

import java.util.Scanner;

public class charMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"George Peter"
        String [] names = input.split("\\s+"); //["George", "Peter"]

        String firstText = names[0]; //"George" -> 6
        String secondText = names[1]; //"Peter" -> 5

        int minLength = Math.min(firstText.length(), secondText.length()); //length of the shorter text -> 5
        int maxLength = Math.max(firstText.length(), secondText.length()); //length of the longer text -> 6

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }

        //equal lengths of the texts
        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        sum = getLeftSymbols(firstText, secondText, minLength, maxLength, sum);

        System.out.println(sum);
    }

    private static int getLeftSymbols(String firstText, String secondText, int minLength, int maxLength, int sum) {
        //determine which text is longer and add the remaining characters that did not participate in multiplication
        if (maxLength == firstText.length()) {
            //first text is longer -> add the remaining characters
            for (int index = minLength; index < firstText.length(); index++) {
                sum += firstText.charAt(index);
            }
        } else {
            //second text is longer -> add the remaining characters
            for (int index = minLength; index < secondText.length(); index++) {
                sum += secondText.charAt(index);
            }
        }
        return sum;
    }
}