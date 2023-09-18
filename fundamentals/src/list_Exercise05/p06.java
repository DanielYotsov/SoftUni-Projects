package list_Exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = readDeck(scanner);
        List<Integer> secondPlayerDeck = readDeck(scanner);

        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {
            int firstPlayerCard = firstPlayerDeck.remove(0);
            int secondPlayerCard = secondPlayerDeck.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(secondPlayerCard);
                secondPlayerDeck.add(firstPlayerCard);
            }
        }

        String winner;
        List<Integer> winningDeck;
        if (firstPlayerDeck.isEmpty()) {
            winner = "Second";
            winningDeck = secondPlayerDeck;
        } else {
            winner = "First";
            winningDeck = firstPlayerDeck;
        }

        int sum = calculateSum(winningDeck);

        printWinnerAndSum(winner, sum);
    }

    private static List<Integer> readDeck(Scanner scanner) {
        int[] cards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> deck = new ArrayList<>();
        for (int card : cards) {
            deck.add(card);
        }

        return deck;
    }

    private static int calculateSum(List<Integer> deck) {
        int sum = 0;
        for (int card : deck) {
            sum += card;
        }
        return sum;
    }

    private static void printWinnerAndSum(String winner, int sum) {
        System.out.println(winner + " player wins! Sum: " + sum);
    }
}