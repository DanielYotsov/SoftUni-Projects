package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Дадено число е валидно, ако е в диапазона [100…200] или е 0.
        // Да се напише програма, която чете цяло число, въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.
        int number =Integer.parseInt(scanner.nextLine());

        if (number == 0){
            System.out.println();
        } else if (number>= 100 && number <= 200){
            System.out.println();

        }else System.out.println("invalid");
    }
}
