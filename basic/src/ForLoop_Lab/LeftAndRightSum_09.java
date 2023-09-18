package ForLoop_Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int currantNumb = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + currantNumb;
        }
        for (int i = 1; i <=n; i++) {
            int currantNumb = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currantNumb;
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);

        }else if (!(leftSum == rightSum)){
            System.out.printf("No, diff = %d",Math.abs(leftSum - rightSum));
        }

    }
}
