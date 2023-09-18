package ObjectsAndClasses_Exercise06.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the article data
        String articleData = scanner.nextLine();
        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        // Create an instance of the Article class
        article article = new article(title, content, author);

        // Read the number of commands
        int n = Integer.parseInt(scanner.nextLine());

        // Process the commands
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            // Check the type of command and perform the corresponding action
            if (command.startsWith("Edit: ")) {
                String newContent = command.substring(6);
                article.edit(newContent);
            } else if (command.startsWith("ChangeAuthor: ")) {
                String newAuthor = command.substring(14);
                article.ChangeAuthor(newAuthor);
            } else if (command.startsWith("Rename: ")) {
                String newTitle = command.substring(8);
                article.Rename(newTitle);
            }
        }

        // Print the final state of the article
        System.out.println(article);

        scanner.close();
    }
}