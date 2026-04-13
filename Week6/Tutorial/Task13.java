package Tutorial;
import java.util.*;

public class Task13 {
	public static void main(String[] args) {
		HashMap<String, Integer> obj = new HashMap<>();
		obj.put("Bic", 10);
		obj.put("White", 55);
		obj.put("Sagarmatha", 22);
		
		System.out.println(obj);
		for(String key: obj.keySet()) {
			System.out.println("Key:" + key + "Valu:" + obj.get(key));
		}
		
		System.out.println(obj.get("Sagarmatha"));
		
		System.out.println(obj.replace("Bic", 10));
		System.out.println(obj);
		
		System.out.println(obj.remove("Bic"));
		System.out.println(obj);
	}

}
