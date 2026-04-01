package Workshop;

public class Shape {
	double getPerimeter(){
		return 0;
	}
	
	double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	@Override
	double getPerimeter(){
		 return 2 * 3.14 * radius;
		
	}
	
	@Override
	double getArea() {
		return 3.14 * radius * radius;
		
	}
}


