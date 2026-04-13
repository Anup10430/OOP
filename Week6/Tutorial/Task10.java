package Tutorial;

import java.util.*;
public class Task10 {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		System.out.println(t);
		
		System.out.println(t.descendingSet());
	}

}
