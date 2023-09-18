package list_Exercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = readWagons(scanner); // Read the initial state of the wagons
        int maxCapacity = Integer.parseInt(scanner.nextLine()); // Read the max capacity of each wagon

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.startsWith("Add")) {
                int passengers = Integer.parseInt(command.split(" ")[1]);
                addWagon(wagons, passengers);
            } else {
                int passengers = Integer.parseInt(command);
                distributePassengers(wagons, maxCapacity, passengers);
            }

            command = scanner.nextLine();
        }

        printTrainState(wagons);
    }

    private static List<Integer> readWagons(Scanner scanner) {
        String[] wagonData = scanner.nextLine().split(" ");
        List<Integer> wagons = new ArrayList<>();

        for (String data : wagonData) {
            int passengers = Integer.parseInt(data);
            wagons.add(passengers);
        }

        return wagons;
    }

    private static void addWagon(List<Integer> wagons, int passengers) {
        wagons.add(passengers);
    }

    private static void distributePassengers(List<Integer> wagons, int maxCapacity, int passengers) {
        for (int i = 0; i < wagons.size(); i++) {
            int availableSeats = maxCapacity - wagons.get(i);
            if (availableSeats >= passengers) {
                wagons.set(i, wagons.get(i) + passengers);
                break;
            }
        }
    }

    private static void printTrainState(List<Integer> wagons) {
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i));
            if (i < wagons.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}