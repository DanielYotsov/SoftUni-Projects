package WhileLoop_Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());

        int cakePeaces = length * wide;
        boolean noMorePeaces = false;
        while (cakePeaces > 0){
            String input = scanner.nextLine();
            if (input.equals("STOP")){
                break;
            }else{
                int peace = Integer.parseInt(input);
                cakePeaces = cakePeaces - peace;
            }
        }
        if (cakePeaces < 0) {
            noMorePeaces = true;
        }
        if (noMorePeaces){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePeaces));
        }else {
            System.out.printf("%d pieces are left.",cakePeaces);
        }
    }
}
