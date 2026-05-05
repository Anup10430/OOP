package Workshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int wordCount = 0;

        try {
            File file = new File("one.txt"); 
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                scanner.next(); 
                wordCount++;
            }

            scanner.close();

            System.out.println("Total number of words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}