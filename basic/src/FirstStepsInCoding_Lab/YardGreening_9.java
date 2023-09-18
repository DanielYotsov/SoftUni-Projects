package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class YardGreening_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
       double area = Double.parseDouble(scanner.nextLine());
       double total = area * 7.61;
       double discount = total * 0.18;
       double finalPrice = total - discount;
        //•	"The final price is: {крайна цена на услугата} lv."
        System.out.println("The final price is: " + (total - discount));
        System.out.println("The discount is: " + discount);
        //•	"The discount is: {отстъпка} lv."
    }
}
