package Tutorial;

import java.util.*;

public class Task4 {
	
	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<>(List.of("Nic", "Bic", "Sanima", "Bic"));
		System.out.println(obj.indexOf("Bic"));
		System.out.println(obj.lastIndexOf("Bic"));
		System.out.println(obj.isEmpty());
		
	}

}
