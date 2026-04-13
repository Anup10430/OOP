package Workshop;

import java.util.HashMap;
import java.util.Map;

public class Task11 {
	static HashMap<String, String> countryCapitals = new HashMap<>();

    public static void main(String[] args) {
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Brazil", "Brasilia");
  
        System.out.println("Printing map using printMap():");
        printMap(countryCapitals);

        System.out.println("\nCapital of Nepal: " + getCapital("Nepal"));

        System.out.println("\nDoes capital 'New Delhi' exist? " + containsCapital("New Delhi"));
        System.out.println("Does capital 'London' exist? " + containsCapital("London"));

        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }

    public static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }

    public static String getCapital(String country) {
        return countryCapitals.get(country);
    }

    public static boolean containsCapital(String capital) {
        return countryCapitals.containsValue(capital);
    }
}
