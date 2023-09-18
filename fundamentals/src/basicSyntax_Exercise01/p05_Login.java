package basicSyntax_Exercise01;

import java.util.Scanner;

public class p05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass ="";

        int errorCount = 0;
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            pass += currentSymbol;
        }
        String currentPass = scanner.nextLine();

        while (!currentPass.equals(pass)) {
//            }else {
            errorCount++;
            if (errorCount == 4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            currentPass = scanner.nextLine();

        }
        if (currentPass.equals(pass)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
