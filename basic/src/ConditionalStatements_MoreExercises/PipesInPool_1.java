package ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class PipesInPool_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sumP = p1 * h  +  p2 * h;
        double percentP1 = ((p1 * h) / sumP) *100;
        double percentP2 = ((p2 * h) / sumP) *100;
        double percent = (sumP / v) * 100;
        if (sumP <= v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percent, percentP1, percentP2);
        }else if (sumP > v){
            double overflow = sumP - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }

    }
}
