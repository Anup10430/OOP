package Workshop;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {
	 public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(3);
	        numbers.add(25);
	        numbers.add(7);
	        numbers.add(18);

	        // Sort the list (required for binary search)
	        Collections.sort(numbers);
	        System.out.println("Sorted List: " + numbers);

	        int target = 7;

	        // Perform binary search
	        int result = binarySearch(numbers, target);

	        if (result != -1) {
	            System.out.println("Element " + target + " found at index: " + result);
	        } else {
	            System.out.println("Element " + target + " not found.");
	        }
	    }

	    // Binary search method
	    public static int binarySearch(ArrayList<Integer> list, int target) {
	        int left = 0;
	        int right = list.size() - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (list.get(mid) == target) {
	                return mid;
	            } else if (list.get(mid) < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; // Element not found
	    }
}
