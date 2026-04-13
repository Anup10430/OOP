package Workshop;

import java.util.*;

public class Task9 {

    public static HashSet<String> performUnion(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static HashSet<String> performIntersection(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static HashSet<String> performDifference(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Dog", "Cat", "Elephant", "Lion"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Cat", "Giraffe", "Dog", "Monkey"));
        
        // Print original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union
        System.out.println("Union: " + performUnion(set1, set2));

        // Intersection
        System.out.println("Intersection: " + performIntersection(set1, set2));

        // Difference
        System.out.println("Difference: " + performDifference(set1, set2));
    }
}