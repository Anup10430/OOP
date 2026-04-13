package Workshop;

import java.util.Stack;

public class Task5 {
	public static void main(String[] args) {
		
		// A
		Stack<String> tasks = new Stack<>();
		tasks.add("Read");
		tasks.add("Write");
		tasks.add("Code");
		System.out.println(tasks);
		
		// B
		System.out.println(tasks.pop());
		
		// C
		System.out.println(tasks.push("Debug"));
		System.out.println(tasks.push("Test"));
		
		// D 
		System.out.println(tasks.peek());
		
		// E
		System.out.println(tasks);
		
	}

}
