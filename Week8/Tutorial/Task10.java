package Tutorial;

import java.io.*;

public class Task10 {
    public static void main(String[] args) throws IOException {

        FileOutputStream O = new FileOutputStream("source.txt");
        String d = "Java is a high level programming language";
        O.write(d.getBytes());
        O.close();
        
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("source.txt"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("destination.txt"));

        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }

        in.close();
        out.close();

        System.out.println("File copied successfully");
        
        // Task-11
        File oldFile = new File("source.txt");
        File newFile = new File("renamed.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("File renaming failed");
        }
    }
}