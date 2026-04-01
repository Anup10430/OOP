package Workshop;

public class Person {
	protected String Address;
	
	Person(String Address){
		this.Address = Address;
	}
	
}

class Employee extends Person{
	private String department;
	
	Employee(String address, String department) {
        super(address); 
        this.department = department;
    }
	
	void display() {
        System.out.println("Address: " + Address);
        System.out.println("Department: " + department);
    }

	
}
