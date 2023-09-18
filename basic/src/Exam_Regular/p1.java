package Exam_Regular;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bucketsWithPaint = Integer.parseInt(scanner.nextLine());//Броя кутии с боя – цяло число в интервала [1 … 10 000]
        int wallpaperRows = Integer.parseInt(scanner.nextLine());//Броя на ролките тапети – цяло число в интервала [1 ... 10 000]
        double glovePrice = Double.parseDouble(scanner.nextLine());//Цената за един чифт ръкавици – реално число  в интервала [0.00 ... 1000.00]
        double paintbrushPrice = Double.parseDouble(scanner.nextLine());//4.	Цената за една четка – реално число  в интервала [0.00 ... 2000.00]

        double paintPrice = bucketsWithPaint * 21.50;
        double wallpaperPrice = wallpaperRows * 5.20;
        double totalGloves = Math.ceil(wallpaperRows * 0.35);
        double totalPaintbrushes = Math.floor(bucketsWithPaint * 0.48);
        double totalGlovePrice = totalGloves * glovePrice;
        double totalPaintbrushPrice = totalPaintbrushes * paintbrushPrice;

        double total = paintPrice + wallpaperPrice + totalGlovePrice + totalPaintbrushPrice;
        double delivery = total / 15;
        System.out.printf("This delivery will cost %.2f lv.\n", delivery);



    }
}
