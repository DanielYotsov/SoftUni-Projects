package final_exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(\\|)(?<name>[A-Z]{4,})\\1:?(#)(?<position>[A-Za-z]+ [A-Za-z]+)\\3");

        for (int i = 0; i < n; i++) {
            String boss = scanner.nextLine();
            Matcher matcher = pattern.matcher(boss);

            if (matcher.find()) {
                String name = matcher.group("name");
                String position = matcher.group("position");

                System.out.printf("%s, The %s\n>> Strength: %d\n>> Armor: %d\n", name, position, name.length(), position.length());
            } else {

                System.out.println("Access denied!");
            }
        }
    }
}