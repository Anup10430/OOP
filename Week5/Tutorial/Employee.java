package Tutorial;

interface Employee {
	public void printEmployeeId();
	public void printSalary();
}

class Manager implements Employee{
	int employeeId;
	double salary;
	
	Manager(int employeeId, double salary){
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	@Override
	public void printEmployeeId() {
		System.out.println("EmployeeId : " + employeeId);
	}
	
	@Override
	public void printSalary() {
		System.out.println("Salary : " + salary);
	}
}