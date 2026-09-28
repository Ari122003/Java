package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // HashMap stores data as key-value pairs: key -> value.
        // Every key must be unique, but different keys may have the same value.
        // HashMap provides fast average-time insertion, lookup, and removal.
        // It does not guarantee insertion order or sorted order when iterating.
        // It allows one null key and multiple null values.
        Map<Integer, String> map = new HashMap<>();

        // ==================== INSERT AND UPDATE ====================
        // put(key, value) adds a new entry or replaces the value of an existing key.
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        map.put(2, "TWO"); // key 2 already exists, so "two" is replaced by "TWO"

        // putIfAbsent() adds an entry only when the key is not already present.
        map.putIfAbsent(5, "five"); // added because key 5 is absent
        map.putIfAbsent(1, "ONE"); // ignored because key 1 already exists

        // ==================== ACCESS VALUES ====================
        // get(key) returns the value for a key, or null when the key is absent.
        System.out.println("Value for key 3: " + map.get(3)); // three

        // getOrDefault() returns the value if the key exists; otherwise it
        // returns the supplied default without adding anything to the map.
        System.out.println("Value for key 10: " + map.getOrDefault(10, "unknown"));

        // ==================== CHECK CONTENT ====================
        // containsKey() checks whether a key exists.
        System.out.println("Contains key 2: " + map.containsKey(2)); // true

        // containsValue() checks whether at least one entry has this value.
        System.out.println("Contains value 'three': " + map.containsValue("three")); // true

        // isEmpty() checks whether the map has no entries.
        System.out.println("Is empty: " + map.isEmpty()); // false

        // size() returns the number of key-value pairs.
        System.out.println("Size: " + map.size());

        // ==================== REMOVE ENTRIES ====================
        // remove(key) removes the entry for the key and returns its old value.
        String removedValue = map.remove(5);
        System.out.println("Removed value: " + removedValue); // five

        // remove(key, value) removes only when both the key and value match.
        // It returns true if an entry was removed.
        boolean removed = map.remove(4, "wrong value"); // false; entry remains
        System.out.println("Removed matching entry: " + removed);
        map.remove(4, "four"); // true; entry is removed

        // ==================== REPLACE VALUES ====================
        // replace(key, value) changes a value only when the key exists.
        map.replace(3, "THREE");

        // replace(key, oldValue, newValue) changes a value only when both
        // the key and its current value match. It returns true on success.
        map.replace(2, "TWO", "two");

        // replaceAll() applies an operation to every value in the map.
        map.replaceAll((key, value) -> value.toUpperCase());

        // ==================== CONDITIONAL COMPUTATION ====================
        // computeIfAbsent() creates a value only when the key is missing.
        // The function receives the missing key and returns its new value.
        map.computeIfAbsent(6, key -> "number-" + key); // adds key 6

        // computeIfPresent() changes a value only when the key already exists.
        map.computeIfPresent(1, (key, value) -> value + "!");

        // compute() runs for an existing or missing key. Returning null removes
        // the key; otherwise the returned value becomes the new value.
        map.compute(3, (key, value) -> value + "-updated");

        // merge() combines a new value with an existing value. If the key is
        // absent, the new value is inserted without calling the remapping function.
        map.merge(6, "-merged", (oldValue, newValue) -> oldValue + newValue);

        // ==================== READ MAP VIEWS ====================
        // keySet() returns a view containing all keys.
        System.out.println("Keys: " + map.keySet());

        // values() returns a view containing all values. Values can repeat.
        System.out.println("Values: " + map.values());

        // entrySet() returns a view of key-value entries. Each entry has
        // getKey() and getValue() methods.
        System.out.println("Entries: " + map.entrySet());

        // ==================== ITERATION ====================
        // forEach() visits every key-value pair. The order is not guaranteed
        // because this is a HashMap, so do not rely on the printed order.
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        // A traditional entrySet loop is useful when both key and value are needed.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ==================== COPY AND CLEAR ====================
        // putAll() copies every entry from another map into this map.
        Map<Integer, String> additionalEntries = new HashMap<>();
        additionalEntries.put(7, "seven");
        additionalEntries.put(8, "eight");
        map.putAll(additionalEntries);

        // clear() removes every entry from the map.
        map.clear();
        System.out.println("After clear, is empty: " + map.isEmpty()); // true
    }
}
