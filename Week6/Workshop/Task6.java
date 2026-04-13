package Workshop;

import java.util.Stack;

public class Task6 {
	public static void main(String[] args) {
		
		String sentence = "Hello World";
		Stack<String> stack = new Stack<>();
		
		String[] words = sentence.split(" ");
		for (String word: words) {
			stack.push(word);
		}
		
		String reversed = " ";
		while(!stack.isEmpty()) {
			reversed += stack.pop() + " ";
		}
		
		System.out.println("Reversed sentence: " + reversed.trim());
	}

}
