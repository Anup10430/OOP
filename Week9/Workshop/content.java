package Workshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class content {
	String firstname;
	String lastname;
	String address;
	String contactnum;
	String semester;
	
	public content(String firstname,
	String lastname,String address,
	String contactnum,
	String semester){
		this.firstname = firstname;
		this.lastname =lastname;
		this.address = address;
		this.contactnum = contactnum;
		this.semester = semester;
	}

	void write(String c)  throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(c));
		bw.write("First Name: " + firstname + "," + " Last Name: " + lastname + "," + " Address: " + address + "," + " Contact Number: " + contactnum + "," + " Semester: " +semester);
        bw.close();
	}
	

}
