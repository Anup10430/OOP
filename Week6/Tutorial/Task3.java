package Tutorial;

import java.util.*;

public class Task3 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("Anup");
		arrayList1.add("Thor");
		arrayList1.add("IronMan");
		arrayList1.add("Spiderman");
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("A");
		arrayList2.add("T");
		arrayList2.add("I");
		arrayList2.add("S");
		
		arrayList1.addAll(arrayList2);
		System.out.println(arrayList1);
	} 

}
