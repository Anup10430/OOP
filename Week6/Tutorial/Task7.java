package Tutorial;
import java.util.*;

public class Task7 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		System.out.println(pq);
		pq.remove("A");
		System.out.println(pq);
		pq.add("D");
		pq.add("E");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
	}

}
