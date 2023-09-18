package exam_prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Go Shopping!")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            String item = commandArr[1];
            switch (command) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    productList.remove(item);
                    break;
                case "Correct":
                    String newItem = commandArr[2];
                    if (productList.contains(item)) {
                        int index = productList.indexOf(item);
                        productList.set(index, newItem);
                    }
                    break;
                //•	Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the end of the list.if
                case "Rearrange":
                    if (productList.contains(item)) {
                        productList.remove(item);
                        productList.add(item);
                    }
                    break;

            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", productList));
    }
}
