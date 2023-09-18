package associativeArrays_Exercise07;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class p04_softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> registeredUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            String action = parts[0];

            if (action.equals("register")) {
                String username = parts[1];
                String licensePlate = parts[2];

                if (registeredUsers.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + registeredUsers.get(username));
                } else {
                    registeredUsers.put(username, licensePlate);
                    System.out.println(username + " registered " + licensePlate + " successfully");
                }
            } else if (action.equals("unregister")) {
                String username = parts[1];

                if (!registeredUsers.containsKey(username)) {
                    System.out.println("ERROR: user " + username + " not found");
                } else {
                    registeredUsers.remove(username);
                    System.out.println(username + " unregistered successfully");
                }
            }
        }

        for (String username : registeredUsers.keySet()) {
            String licensePlate = registeredUsers.get(username);
            System.out.println(username + " => " + licensePlate);
        }
    }
}