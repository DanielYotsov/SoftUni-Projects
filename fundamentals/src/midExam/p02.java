package midExam;

import java.util.*;
import java.util.stream.Collectors;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> usernames = new ArrayList<>();

        String[] friends = scanner.nextLine().split(", ");
        Collections.addAll(usernames, friends);

        int blacklistedCount = 0;
        int lostCount = 0;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Report")) {
                break;
            }

            String[] tokens = command.split(" ");
            String action = tokens[0];

            if (action.equals("Blacklist")) {
                String name = tokens[1];
                if (usernames.contains(name)) {
                    usernames.set(usernames.indexOf(name), "Blacklisted");
                    blacklistedCount++;
                    System.out.println(name + " was blacklisted.");
                } else {
                    System.out.println(name + " was not found.");
                }
            } else if (action.equals("Error")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < usernames.size()) {
                    String name = usernames.get(index);
                    if (!name.equals("Blacklisted") && !name.equals("Lost")) {
                        usernames.set(index, "Lost");
                        lostCount++;
                        System.out.println(name + " was lost due to an error.");
                    }
                }
            } else if (action.equals("Change")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < usernames.size()) {
                    String currentName = usernames.get(index);
                    String newName = tokens[2];
                    System.out.println(currentName + " changed his username to " + newName + ".");
                    usernames.set(index, newName);
                }
            }
        }

        System.out.printf("Blacklisted names: %d\n", blacklistedCount);
        System.out.printf("Lost names: %d\n", lostCount);
        System.out.println(String.join(" ", usernames));
    }
}

