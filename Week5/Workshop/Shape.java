package Workshop;

abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();

}

class Quadrilateral extends Shape{
	@Override
	void calculateArea() {
		System.out.println("It is Area");
	}
	
	@Override
	void calculatePerimeter() {
		System.out.println("It is Perimeter");
	}
}
