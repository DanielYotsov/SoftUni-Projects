package Exam_prep;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForCPU = Double.parseDouble(scanner.nextLine()) * 1.57;//•	На първи ред: цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
        double priceForGPU = Double.parseDouble(scanner.nextLine()) * 1.57; //•	На втори ред: цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
        double priceForRAM = Double.parseDouble(scanner.nextLine()) * 1.57; //•	На трети ред: цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
        int RAMCount = Integer.parseInt(scanner.nextLine());//•	На четвърти: ред брой RAM памети – цяло число в интервала [1 ... 4]
        double discount = Double.parseDouble(scanner.nextLine());//•   На пети ред: процент отстъпка – реално число в интервала [0.01 … 0.1]

        double ramDiscount = priceForRAM * RAMCount;
        double cpuDiscount = priceForCPU - (priceForCPU * discount);
        double gpuDiscount = priceForGPU - (priceForGPU * discount);
        double totalPrice = cpuDiscount + gpuDiscount + ramDiscount;
        System.out.printf("Money needed - %.2f leva.", totalPrice);

    }
}
