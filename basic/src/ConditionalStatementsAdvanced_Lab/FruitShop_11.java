package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Магазин за плодове през работните дни работи на следните цени:

        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.50	1.20	0.85	1.45	    2.70	5.50	    3.85

        //Събота и неделя магазинът работи на по-високи цени:

        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.70	1.25	0.90	1.60	    3.00	5.60	    4.20
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (fruit.equals("banana")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 2.50);
            }else if (day.equals("Saturday") || day.equals("Sunday")){
                System.out.printf("%.2f",quantity * 2.70);
            }else System.out.print("error");
        }else if (fruit.equals("apple")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 1.20);
            }else if (day.equals("Saturday") || day.equals("Sunday")){
                System.out.printf("%.2f",quantity * 1.25);
            }else System.out.print("error");
        }else if (fruit.equals("orange")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 0.85);
            }else if (day.equals("Saturday") || day.equals("Sunday")){
                    System.out.printf("%.2f",quantity * 0.90);
            }else System.out.print("error");
        }else if (fruit.equals("grapefruit")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 1.45);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f", quantity * 1.60);
            }else System.out.print("error");
        }else if (fruit.equals("kiwi")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 2.70);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f", quantity * 3.00);
            }else System.out.print("error");
        }else if (fruit.equals("pineapple")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 5.50);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f", quantity * 5.60);
            }else System.out.print("error");
        }else if (fruit.equals("grapes")){

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                System.out.printf("%.2f",quantity * 3.85);
            }else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.printf("%.2f", quantity * 4.20);
            }else System.out.print("error");
        }else System.out.println("error");


    }
}
