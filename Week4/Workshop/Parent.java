package Workshop;

public class Parent {
	private int num1 = 10;
	protected int num2 = 20;
	public int num3 = 30;
	
	// Getter for private variable
    public int getPrivateVar() {
        return num1;
    }

}

class Child extends Parent {
	void display() {
     System.out.println("Private: " + getPrivateVar());

     // Accessible directly because it's protected
     System.out.println("Protected: " + num2);

     // Accessible directly because it's public
     System.out.println("Public: " + num3);
 }
}