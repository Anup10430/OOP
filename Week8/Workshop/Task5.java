package Workshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		try {
		BufferedWriter w = new BufferedWriter(new FileWriter("student.csv"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = sc.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastname = sc.nextLine();
		
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter your contact Number: ");
		String contactNumber = sc.nextLine();
		
		System.out.println("Enter your contact Semester: ");
		String semester = sc.nextLine();
		
		w.write("First Name: " + firstname + "," + " Last Name: " + lastname + "," + " Address: " + address + "," + " Contact Number: " + contactNumber + "," + " Semester: " +semester);
        w.close();
        sc.close();
        
        System.out.println("Student data written to CSV.");
        
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
