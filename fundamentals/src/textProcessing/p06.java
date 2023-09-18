package textProcessing;

import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        StringBuilder sb = new StringBuilder(inputText);

        for (int index = 0; index < sb.length() - 1; index++) {
            if (sb.charAt(index) == sb.charAt(index + 1)) {
                sb.deleteCharAt(index + 1);
                index--;
            }
        }
        System.out.println(sb);
    }
}
