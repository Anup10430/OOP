package Workshop;

import java.util.*;

public class Task7 {
	public static void main(String[] args) {
		ArrayDeque<String> printQueue = new ArrayDeque<>();
		
		// Enqueue
		printQueue.offer("Document1");
		printQueue.offer("Document2");
		printQueue.offer("Document3");
		
		// Dequeue
		System.out.println("Dequeued Job: " + printQueue.poll());
		
		// Enqueue
		printQueue.offer("Document4");
		printQueue.offer("Document5");
		
		// Peek
		System.out.println("Peek: " + printQueue.peek());
		
		// Print
		for (String job : printQueue) {
			System.out.println(job);
		}
		
	}

}
