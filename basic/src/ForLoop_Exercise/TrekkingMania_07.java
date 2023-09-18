package ForLoop_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        int groupsCount = Integer.parseInt(scanner.nextLine());

        int Musala = 0;
        int Monblan = 0;
        int Kili = 0;
        int K2 = 0;
        int Everest = 0;
        int peopleSum = 0;

        for (int i = 1; i <=groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            if (peopleInGroup <= 5) {
                Musala = Musala + peopleInGroup;
            } else if (peopleInGroup <=12) {
                Monblan = Monblan + peopleInGroup;
            } else if (peopleInGroup <=25) {
                Kili = Kili + peopleInGroup;
            } else if (peopleInGroup <=40) {
                K2 = K2 + peopleInGroup;
            } else {
                Everest = Everest + peopleInGroup;
            }
        }
        peopleSum = Musala + Monblan + Kili + K2 + Everest;
        System.out.printf("%.2f%%\n",Musala * 1.0 / peopleSum * 100);//Musala
        System.out.printf("%.2f%%\n",Monblan * 1.0 / peopleSum * 100);//Monblan
        System.out.printf("%.2f%%\n",Kili * 1.0 / peopleSum * 100);//Kili
        System.out.printf("%.2f%%\n",K2 * 1.0 / peopleSum * 100);//K2
        System.out.printf("%.2f%%\n",Everest * 1.0 / peopleSum * 100);//Everest
    }
}
