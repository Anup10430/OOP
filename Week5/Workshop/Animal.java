package Workshop;

interface Animal {
	public void eat();
	public void walk();

}

interface Printable{
	public void display();
}

class Cow implements Animal, Printable{
	@Override
	public void eat() {
		System.out.println("Eat");
	}
	
	@Override
	public void walk() {
		System.out.println("Walk");
	}
	
	@Override
	public void display() {
		System.out.println("Display");
	}
	
}

interface livingBeing{
	public void specialFeature();
}

class Fish implements livingBeing{
	@Override
	public void specialFeature() {
		System.out.println("Fish can breathe through gills");
	}
}

class Bird implements livingBeing{
	@Override
	public void specialFeature() {
		System.out.println("Bird can fly");
	}
}
