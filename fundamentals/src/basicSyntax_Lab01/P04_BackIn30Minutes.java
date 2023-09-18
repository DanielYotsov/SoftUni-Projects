package basicSyntax_Lab01;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sumMin = (hours * 60) + min + 30;
        int resultH = sumMin / 60;
        int resultM = sumMin % 60;
        if (resultH > 23){
            resultH = 0;
        }
        System.out.printf("%d:%02d", resultH, resultM);

    }
}
