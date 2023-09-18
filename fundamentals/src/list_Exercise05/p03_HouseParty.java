package list_Exercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();
        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String name = commandParts[0];
            if (command.contains("not")){
                if (guestList.contains(name)){
                    guestList.remove(name);
                }else {
                    System.out.println(name + " is not in the list!");
                }
            }else {
                    if (guestList.contains(name)){
                        System.out.println(name + " is already in the list!");
                    }else {
                        guestList.add(name);
                    }
                }

        }
        for (String guestName: guestList) {
            System.out.println(guestName);
        }
    }
}
