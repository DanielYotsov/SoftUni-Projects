package textProcessing;

import java.util.Scanner;

public class validUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_-]{3,16}$");
    }
}