package Tutorial;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;

    Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Anup", 20, "Ab12");
        emp.display();
    }
} 