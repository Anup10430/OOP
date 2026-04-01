package Tutorial;

class Animal{
	void sound() {
		System.out.println("The animal makes sound");
	}
	
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("The cat is meowing");
	}
}

public class methodOverriding {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}

}
