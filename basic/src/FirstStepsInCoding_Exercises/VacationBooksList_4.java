package FirstStepsInCoding_Exercises;

import java.util.Scanner;

public class VacationBooksList_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Брой страници в текущата книга – цяло число в интервала
        int pages = Integer.parseInt(scanner.nextLine());
        //2.Страници, които прочита за 1 час – цяло число в интервала
        int pagesHour = Integer.parseInt(scanner.nextLine());
        //3.Броят на дните, за които трябва да прочете книгата – цяло число в интервала
        int days = Integer.parseInt(scanner.nextLine());
        int completedBook = pages / pagesHour;
        int hoursNeeded = completedBook / days;
        System.out.println(hoursNeeded);

    }
}
