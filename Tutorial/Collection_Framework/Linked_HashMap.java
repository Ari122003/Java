package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        // LinkedHashMap stores key-value pairs like HashMap, but also maintains
        // a linked list of entries so iteration has a predictable order.
        // By default, that order is the order in which keys were inserted.
        // It allows one null key and multiple null values, and keys are unique.
        // It is usually slightly slower and uses more memory than HashMap
        // because it must maintain the links between entries.
        Map<Integer, String> map = new LinkedHashMap<>();

        // ==================== INSERT AND UPDATE ====================
        // put() adds an entry or replaces the value for an existing key.
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        // Updating a key changes its value, but does not move the key to the end.
        map.put(2, "TWO"); // order remains 1, 2, 3, 4, 5

        // putIfAbsent() adds a value only when the key is missing.
        map.putIfAbsent(6, "six"); // added
        map.putIfAbsent(1, "ONE"); // ignored; key 1 already exists

        // ==================== ACCESS VALUES ====================
        // get() returns the value for a key, or null if the key is absent.
        System.out.println("Value for key 3: " + map.get(3)); // three

        // getOrDefault() supplies a temporary fallback without adding the key.
        System.out.println("Value for key 10: " + map.getOrDefault(10, "unknown"));

        // ==================== CHECK CONTENT ====================
        // containsKey() checks for a key; containsValue() checks for a value.
        System.out.println("Contains key 2: " + map.containsKey(2)); // true
        System.out.println("Contains value 'three': " + map.containsValue("three")); // true

        // size() counts entries, while isEmpty() checks whether there are none.
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty()); // false

        // ==================== REMOVE ENTRIES ====================
        // remove(key) removes the entry and returns its old value.
        System.out.println("Removed value: " + map.remove(6)); // six

        // remove(key, value) removes only when both values match.
        map.remove(5, "wrong value"); // not removed
        map.remove(5, "five"); // removed because both key and value match

        // ==================== REPLACE VALUES ====================
        // replace() works only when the key already exists.
        map.replace(4, "FOUR");
        map.replace(3, "three", "THREE"); // conditional replacement

        // replaceAll() transforms every value while keeping the key order.
        map.replaceAll((key, value) -> value.toUpperCase());

        // ==================== CONDITIONAL COMPUTATION ====================
        // computeIfAbsent() creates a value only for a missing key.
        map.computeIfAbsent(7, key -> "number-" + key);

        // computeIfPresent() changes a value only for an existing key.
        map.computeIfPresent(1, (key, value) -> value + "!");

        // compute() can update an existing key or create a missing one.
        // Returning null from the function removes the key.
        map.compute(2, (key, value) -> value + "-updated");

        // merge() combines a new value with the existing value. For a missing
        // key, the supplied value is inserted directly.
        map.merge(7, "-merged", (oldValue, newValue) -> oldValue + newValue);

        // ==================== READ MAP VIEWS ====================
        // These are live views backed by the map, not independent copies.
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // ==================== ITERATION ====================
        // LinkedHashMap preserves insertion order while iterating.
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        // entrySet() is useful when both the key and value are needed.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ==================== COPY AND CLEAR ====================
        // putAll() copies entries in the source map's iteration order.
        Map<Integer, String> additionalEntries = new LinkedHashMap<>();
        additionalEntries.put(8, "eight");
        additionalEntries.put(9, "nine");
        map.putAll(additionalEntries);

        // clear() removes all entries.
        map.clear();
        System.out.println("After clear, is empty: " + map.isEmpty()); // true

        // ==================== ACCESS-ORDER MODE ====================
        // The constructor below creates a different LinkedHashMap that moves
        // an accessed entry to the end. This is useful for LRU cache designs.
        // The third argument means accessOrder = true.
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put(1, "one");
        accessOrderMap.put(2, "two");
        accessOrderMap.put(3, "three");
        accessOrderMap.get(1); // key 1 moves to the end
        System.out.println("Access-order map: " + accessOrderMap); // [2, 3, 1]
    }
}
