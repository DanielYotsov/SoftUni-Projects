package WhileLoop_Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String command = scanner.nextLine();
        int checkedBooksCount = 0;
        boolean bookIsFound = false;

        while (!command.equals("No More Books")){
           String currantBook = command;
           if (currantBook.equals(wantedBook)){
               bookIsFound = true;
               break;
           }
            checkedBooksCount ++;
            command = scanner.nextLine();
        }
        if (bookIsFound){
            System.out.printf("You checked %d books and found it.",checkedBooksCount);

        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",checkedBooksCount);
        }
    }
}
