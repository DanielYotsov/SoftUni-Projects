package ForLoop_Lab;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < words.length(); i++) {
            char letter = words.charAt(i);

            switch (letter) {
                case 'a'://1
                    sum += 1;
                    break;
                case 'e'://2
                    sum += 2;
                    break;
                case 'i'://3
                    sum += 3;
                    break;
                case 'o'://4
                    sum += 4;
                    break;
                case 'u'://5
                    sum += 5;
                    break;
            }
        }System.out.println(sum);
    }
}
