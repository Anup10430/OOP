package Workshop;

public class Animal {
	String name;
	int age;
}

class Dog extends Animal{
	String breed;
	
	Dog(String name, int age, String breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	void display() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Breed:" + breed);
	}

}
