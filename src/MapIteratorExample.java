package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Obtain an iterator for the entry set
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterate through the map using the iterator
        System.out.println("Iterating over the map:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            // Optionally remove an entry (e.g., remove "Banana")
            if ("Banana".equals(entry.getKey())) {
                iterator.remove();
            }
        }

        // Display the modified map
        System.out.println("\nModified Map: " + map);
    }
}
