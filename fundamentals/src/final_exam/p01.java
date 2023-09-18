package final_exam;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        while (!input2.equals("Done")) {
            String command = input2.split(" ")[0];
            switch (command) {
                case "Change":
                    String symbol = input2.split(" ")[1];
                    String replacement = input2.split(" ")[2];
                    input1 = input1.replace(symbol, replacement);
                    System.out.println(input1);
                    break;
                case "Includes":
                    String substring = input2.split(" ")[1];
                    if (input1.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    substring = input2.split(" ")[1];
                    StringBuilder sb = new StringBuilder(input1);
                    String sbSubstring = sb.substring(sb.length() - substring.length(), sb.length());
                    if (substring.equals(sbSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input1 = input1.toUpperCase();
                    System.out.println(input1);
                    break;
                case "FindIndex":
                    symbol = input2.split(" ")[1];
                    int index = input1.indexOf(symbol);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(input2.split(" ")[1]);
                    int count = Integer.parseInt(input2.split(" ")[2]);
                    substring = input1.substring(startIndex, startIndex + count);
                    System.out.println(substring);
                    break;
            }
            input2 = scanner.nextLine();
        }
    }
}