package ForLoop_Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 =0;//n<200
        int p2 =0;//200>=n<=399
        int p3 =0;//400>=n<=599
        int p4 =0;//600>=n<=799
        int p5 =0;//800>=

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < 200){
                p1 ++;
            }else if (currentNum <= 399){
                p2 ++;
            }else if (currentNum <= 599){
                p3 ++;
            }else if (currentNum <= 799){
                p4 ++;
            }else if (currentNum >= 800){
                p5 ++;
            }
        }
        System.out.printf("%.2f%%\n",p1*1.0 / n * 100);
        System.out.printf("%.2f%%\n",p2*1.0 / n * 100);
        System.out.printf("%.2f%%\n",p3*1.0 / n * 100);
        System.out.printf("%.2f%%\n",p4*1.0 / n * 100);
        System.out.printf("%.2f%%\n",p5*1.0 / n * 100);

    }
}
