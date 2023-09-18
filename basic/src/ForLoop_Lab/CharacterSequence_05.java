package ForLoop_Lab;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        for (int i = 0; i < words.length(); i++) {
            char letter = words.charAt(i);
            System.out.println(letter);
            
        }
    }
}
