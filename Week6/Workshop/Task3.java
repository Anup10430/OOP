package Workshop;

import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int k = 2;
		
		Collections.rotate(num, k);
		System.out.println(num);
			
	}

}
