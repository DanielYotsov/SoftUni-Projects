package textProcessing;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        String fileNameWithExtension = filePath.substring(filePath.lastIndexOf('\\') + 1);
        int dotIndex = fileNameWithExtension.lastIndexOf('.');
        String fileNameWithoutExtension = fileNameWithExtension.substring(0, dotIndex);
        String fileExtension = fileNameWithExtension.substring(dotIndex + 1);

        System.out.println("File name: " + fileNameWithoutExtension);
        System.out.println("File extension: " + fileExtension);
    }
}