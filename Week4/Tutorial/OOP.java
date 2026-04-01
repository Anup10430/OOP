package Tutorial;

class Shape{
	String color;
	
	Shape(String color){
		this.color = color;
	}
	
	void area() {
		System.out.println("This is a area");
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(int length, int width, String color){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	void display() {
		System.out.println("Lenght:" + length);
		System.out.println("Width:" + width);
		System.out.println("Color:" + color);
		super.area();
		
	}
}

public class OOP {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 4, "Red");
		r.display();
	}
	

}
