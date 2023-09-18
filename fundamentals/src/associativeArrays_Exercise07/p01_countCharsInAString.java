package associativeArrays_Exercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01_countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol:input.toCharArray()) {
            if (symbol == ' '){
                continue;
            }
            if (symbolsCount.containsKey(symbol)){
                int currantCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol,currantCount + 1);
            }else {
                symbolsCount.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
