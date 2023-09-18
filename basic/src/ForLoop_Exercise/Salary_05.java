package ForLoop_Exercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <=tabs ; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case ("Facebook")://•	"Facebook" -> 150 лв.
                    salary = salary - 150;
                    break;
                case ("Instagram"): //•	"Instagram" -> 100 лв.
                    salary = salary - 100;
                    break;
                case ("Reddit")://•	"Reddit" -> 50 лв.
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0){
                break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else if (salary > 0){
            System.out.printf("%.0f",salary);
        }

    }
}
