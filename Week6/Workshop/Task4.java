package Workshop;

import java.util.*;

public class Task4 {
	public static void main(String[] args) {
		// A
		LinkedList<String> colors = new LinkedList<>(List.of("Red", "Green", "Blue", "White", "Black"));
		Iterator<String> a = colors.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		// B
		if(colors.contains("Red")) {
			System.out.println("Red exist");
		}
		
		// C
		Collections.shuffle(colors);
		System.out.println(colors);
		
		// D
		Collections.sort(colors);
		System.out.println(colors);
	}

}
