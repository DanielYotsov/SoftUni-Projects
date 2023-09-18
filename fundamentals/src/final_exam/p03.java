package final_exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> infoLikes = new LinkedHashMap<>();
        Map<String, Integer> infoComments = new LinkedHashMap<>();

        String username;

        while (!input.equals("Log out")) {
            String command = input.split(":")[0];

            switch (command) {
                case "New follower":
                    username = input.split(": ")[1];

                    if (!infoLikes.containsKey(username) && !infoComments.containsKey(username)) {
                        infoLikes.put(username, 0);
                        infoComments.put(username, 0);
                    }
                    break;
                case "Like":
                    username = input.split(": ")[1];
                    int likesCount = Integer.parseInt(input.split(": ")[2]);

                    if (!infoLikes.containsKey(username)) {
                        infoLikes.put(username, likesCount);
                        infoComments.put(username, 0);
                    } else {
                        int currentLikes = infoLikes.get(username);
                        int updatedLikes = currentLikes + likesCount;
                        infoLikes.put(username, updatedLikes);
                    }
                    break;
                case "Comment":
                    username = input.split(": ")[1];

                    if (!infoComments.containsKey(username)) {
                        infoComments.put(username, 1);
                        infoLikes.put(username, 0);
                    } else {
                        int currentComments = infoComments.get(username);
                        infoComments.put(username, currentComments + 1);
                    }
                    break;
                case "Blocked":
                    username = input.split(": ")[1];

                    if (!infoLikes.containsKey(username) && !infoComments.containsKey(username)) {
                        System.out.println(username + " doesn't exist.");
                    } else {
                        infoLikes.remove(username);
                        infoComments.remove(username);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        int count = infoLikes.size();
        System.out.println(count + " followers");
        for (Map.Entry<String, Integer> entry : infoLikes.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue() + infoComments.get(entry.getKey()));
        }
    }
}