package Workshop;

import java.util.Arrays;
import java.util.Collections;

public class Task12 {
	 public static void main(String[] args) {

	        Integer[] numbers = {5, 2, 9, 1, 7};

	        Arrays.sort(numbers);
	        System.out.println("Ascending order: " + Arrays.toString(numbers));

	        Arrays.sort(numbers, Collections.reverseOrder());
	        System.out.println("Descending order: " + Arrays.toString(numbers));
	    }
}
