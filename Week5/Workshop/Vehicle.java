package Workshop;

abstract class Vehicle {
	public void wheel() {
		
	}
	public void door() {
		
	}

}

class Bus extends Vehicle{
	@Override
	public void door() {
		System.out.println("It is a door");
	}
}
