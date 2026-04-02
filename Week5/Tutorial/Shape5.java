package Tutorial;

interface Shape5 {
	public void calculateArea();
}

class Circle implements Shape5{
	int r;
	Circle(int r){
		this.r = r;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle: " + 3.14 * r * r);
	}
}

class Rectangle implements Shape5{
	int l;
	int w;
	Rectangle(int l, int w){
		this.l = l;
		this.w = w;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle: " + l * w);
	}
}
