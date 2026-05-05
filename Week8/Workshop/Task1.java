package Workshop;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args)throws IOException {
		 FileOutputStream O = new FileOutputStream("one.txt");
	        String d = "Hi my name is Anup Chaudhary.";
	        O.write(d.getBytes());
	        O.close();
	        
	        BufferedInputStream in = new BufferedInputStream(new FileInputStream("one.txt"));
	        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("two.txt"));

	        int ch;
	        while ((ch = in.read()) != -1) {
	            out.write(ch);
	        }

	        in.close();
	        out.close();
	}

}
