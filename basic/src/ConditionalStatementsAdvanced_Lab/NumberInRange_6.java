package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class NumberInRange_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());

if (number == 0){
    System.out.println("No");
} else if (number > 100){
    System.out.println("No");
} else if (number < -100 ){
    System.out.println("No");
}else System.out.println("Yes");
    }
}