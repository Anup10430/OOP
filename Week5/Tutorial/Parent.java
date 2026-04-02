package Tutorial;

abstract class Parent{
	abstract void message();
}

class Child1 extends Parent{
	@Override
	void message() {
		System.out.println("This is first sub class");
	}
}

class Child2 extends Parent{
	@Override
	void message() {
		System.out.println("This is second sub class");
	}
}



