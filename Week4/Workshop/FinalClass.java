package Workshop;

public class FinalClass {
	void display() {
		System.out.println("This is a final class");
	}
}

class SubClass extends FinalClass{
	@Override
	void show() {
		System.out.println("Trying to extend FinalClass");
	}
}
