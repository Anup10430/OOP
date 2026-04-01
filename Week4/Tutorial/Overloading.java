package Tutorial;

class AreaCalculator{
	void calculateArea(int length, int breadth) {
		System.out.println("The area of rectangle is " + length * breadth);
	}
	
	void calculateArea(int length) {
		System.out.println("The area of square is " + length * length);
	}
	
	void calculateArea(double base, double height) {
		System.out.println("The area of triangle is " + 0.5 * base * height);
	}
}



public class Overloading {
	public static void main(String[] args) {
		AreaCalculator a = new AreaCalculator();
		a.calculateArea(10, 4);
		a.calculateArea(5);
		a.calculateArea(10.0, 6.0);
	}

}
