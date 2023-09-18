package ObjectsAndClasses_Exercise06;

import java.util.Random;
import java.util.Scanner;

public class p01 {
    private static final String[] PHRASES = {
            "Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."
    };

    private static final String[] EVENTS = {
            "Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy with the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"
    };

    private static final String[] AUTHORS = {
            "Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"
    };

    private static final String[] CITIES = {
            "Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"
    };

    public static String generateRandomMessage() {
        Random random = new Random();
        String phrase = PHRASES[random.nextInt(PHRASES.length)];
        String event = EVENTS[random.nextInt(EVENTS.length)];
        String author = AUTHORS[random.nextInt(AUTHORS.length)];
        String city = CITIES[random.nextInt(CITIES.length)];

        return phrase + " " + event + " " + author + " - " + city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = scanner.nextInt();

        for (int i = 0; i < numberOfMessages; i++) {
            String message = generateRandomMessage();
            System.out.println(message);
        }

        scanner.close();
    }
}