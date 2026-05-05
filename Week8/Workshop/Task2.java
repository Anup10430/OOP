package Workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Task2 {
	public static void main(String[] args) {
		try {
		BufferedReader r = new BufferedReader(new FileReader("student.csv"));
		BufferedWriter w = new BufferedWriter(new FileWriter("newStudent.csv"));
		
		String line;

        while ((line = r.readLine()) != null) {
            w.write(line);
            w.newLine();
        }

        r.close();
        w.close();
        
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
