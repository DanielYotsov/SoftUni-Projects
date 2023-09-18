package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());//N1 – цяло число в интервала [0...40 000]
        int n2 = Integer.parseInt(scanner.nextLine());//N2 – цяло число в интервала [0...40 000]
        String character = scanner.nextLine();//Оператор – един символ измеду: "+", "-", "*", "/", "%"
        double result = 0;
        String evenOrOdd  = "";
        boolean isZero = false;

        switch (character) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    isZero = true;
                } else {
                    result = n1 * 1.0 / n2;
                }
                break;
            case "%":
                if (n2 == 0) {
                    isZero = true;
                } else {
                    result = n1 * 1.0 % n2;
                }
                break;
        }
        if (result %2==0) {
            evenOrOdd = "even";
        }else {
            evenOrOdd = "odd";
        }
        if (character.equals("+") || character.equals("-") || character.equals("*")){
            System.out.printf("%d %s %d = %.0f - %s", n1, character, n2, result,evenOrOdd);

        }else if (character.equals("/") && !isZero ){
            System.out.printf("%d / %d = %.2f" , n1, n2, result);

        }else if (character.equals("%") && !isZero ){
            System.out.printf("%d %s %d = %.0f" , n1, character, n2, result);

        }else {
            System.out.printf("Cannot divide %d by zero",n1);
        }
    }

}

