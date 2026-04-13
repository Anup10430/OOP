package Tutorial;

import java.util.*;

public class Task5 {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>(List.of("Red", "Green", "Blue"));
		colors.set(1,"Purple");
		System.out.println(colors);
		colors.remove("Blue");
		System.out.println(colors);
	}
}
