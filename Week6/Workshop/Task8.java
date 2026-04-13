package Workshop;

import java.util.TreeSet;

public class Task8 {
	public static void main(String[] args) {
		TreeSet<String> name = new TreeSet<>();
		name.add("Anup");
		name.add("Thor");
		name.add("IronMan");
		name.add("Spiderman");
		
		System.out.println("Names in Alphbetical Order: ");
		for (String n : name) {
			System.out.println(n);
		}
	}

}
