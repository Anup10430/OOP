package Workshop;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Anup");
		name.add("Thor");
		name.add("IronMan");
		name.add("Spiderman");
		name.remove("Anup");
		System.out.println(name);
		
		String[] names = new String[3];
		names[0] = "A";
		names[1] = "B";
		names[2] = "C";
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}

}
