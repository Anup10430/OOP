package Tutorial;

import java.util.*;

public class Task6 {
	public static void main( String[] args) {
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		s.push("D");
		s.push("E");
		System.out.println(s.peek());
		System.out.println(s);
	}

}
