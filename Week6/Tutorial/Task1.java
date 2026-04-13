package Tutorial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Anup");
		obj.add("Thor");
		obj.add("IronMan");
		obj.add("Spiderman");
		obj.remove("Anup");
		System.out.println(obj);
		
		Iterator<String> a = obj.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		// Task-2
		Collections.reverse(obj);
		System.out.println(obj);
	}

}
