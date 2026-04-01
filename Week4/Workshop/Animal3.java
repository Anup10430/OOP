package Workshop;

public class Animal3 {
		String name;
		
		Animal3(String name){
			this.name = name;
		}
}

class Dog3 extends Animal3{
	Dog3(String name){
		super(name);
	}
		
	void makeSound() {
		System.out.println(name + " says: Bhau Bhau!");
	}
}

