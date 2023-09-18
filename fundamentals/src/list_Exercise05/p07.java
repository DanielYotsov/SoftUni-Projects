package list_Exercise05;

import java.util.*;
import java.util.stream.Collectors;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(listSeparatedByPipe);

        String finalResult = String.join(" ", listSeparatedByPipe)
                .replaceAll("\\s+", " ");

        System.out.println(finalResult);
    }
}