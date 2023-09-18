package NestedLoops_Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;
        int countTotalTickets = 0;
        while (!command.equals("Finish")) {
            String movie = command;
            int availableSeats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                countTotalTickets++;
                countCurrentTickets++;
                if (ticketType.equals("student")) {
                    studentTicket++;
                } else if (ticketType.equals("standard")) {
                    standardTicket++;
                } else if (ticketType.equals("kid")) {
                    kidTicket++;
                }

                if (countCurrentTickets >= availableSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movie, countCurrentTickets * 1.0 / availableSeats * 100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.\n",(studentTicket * 1.0 / countTotalTickets )* 100);
        System.out.printf("%.2f%% standard tickets.\n",(standardTicket * 1.0 / countTotalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.\n",(kidTicket * 1.0 / countTotalTickets) * 100);
    }
}
