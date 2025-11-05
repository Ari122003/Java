package Collection_Framework;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {

        // ✅ Constructors
        ArrayList<String> list = new ArrayList<>();      // creates empty ArrayList
        ArrayList<String> list2 = new ArrayList<>(20);   // initial capacity = 20
        ArrayList<String> list3 = new ArrayList<>(List.of("X", "Y"));  // copy from another collection

        // ✅ ADD Methods
        list.add("A");                      // add at end → [A]
        list.add("B");                      // [A, B]
        list.add(1, "C");                   // insert at index 1 → [A, C, B]
        list.addAll(list3);                 // add all from another list → [A, C, B, X, Y]
        list.addAll(2, List.of("P", "Q"));  // insert group at index 2 → [A, C, P, Q, B, X, Y]

        System.out.println("list: " + list);

        // ✅ ACCESS Methods
        System.out.println("get(2): " + list.get(2));     // element at index 2 → P
        System.out.println("size: " + list.size());       // number of elements
        System.out.println("isEmpty: " + list.isEmpty()); // checks empty? false
        System.out.println("contains \"A\": " + list.contains("A")); // true

        // ✅ UPDATE
        list.set(1, "NEW");               // replace element at index → [A, NEW, P, Q, B, X, Y]
        System.out.println("After update: " + list);

        // ✅ REMOVE Methods
        list.remove("P");                 // remove first occurrence → [A, NEW, Q, B, X, Y]
        list.remove(0);                   // remove index 0 → [NEW, Q, B, X, Y]
        System.out.println("After remove: " + list);

        list.removeAll(List.of("Q", "X")); // remove multiple → [NEW, B, Y]
        System.out.println("removeAll: " + list);

        list.retainAll(List.of("NEW", "B")); // keep only these → [NEW, B]
        System.out.println("retainAll: " + list);

        list.clear();                     // remove all elements → []
        System.out.println("After clear, isEmpty: " + list.isEmpty()); // true

        // ✅ ADD again
        list.addAll(List.of("A", "B", "C", "A"));   // [A, B, C, A]

        // ✅ SEARCH
        System.out.println("indexOf A: " + list.indexOf("A"));      // first A → 0
        System.out.println("lastIndexOf A: " + list.lastIndexOf("A")); // last A → 3

        // ✅ ITERATION
        System.out.println("for loop:");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");       // prints sequentially
        System.out.println();

        System.out.println("for-each:");
        for (String s : list)
            System.out.print(s + " ");                 // enhanced for loop
        System.out.println();

        System.out.println("Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");         // iterator traversal
        System.out.println();

        System.out.println("ListIterator (reverse):");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious())
            System.out.print(lit.previous() + " ");    // reverse traversal
        System.out.println();

        // ✅ SUBLIST
        List<String> sub = list.subList(1, 3);         // from index 1 to 2 → [B, C]
        System.out.println("subList(1,3): " + sub);

        // ✅ TO ARRAY
        Object[] arr = list.toArray();                 // convert to Object[]
        System.out.println("toArray: " + Arrays.toString(arr));

        String[] strArr = list.toArray(new String[0]); // convert to String[]
        System.out.println("toArray(String[]): " + Arrays.toString(strArr));

        // ✅ SORTING
        Collections.sort(list);                        // sort ascending
        System.out.println("sorted: " + list);

        // ✅ ENSURE CAPACITY
        list.ensureCapacity(50);                       // improve capacity to avoid reallocation

        // ✅ CLONE
        ArrayList<String> cloned = (ArrayList<String>) list.clone(); // shallow copy
        System.out.println("cloned: " + cloned);

        // ✅ Replace all
        list.replaceAll(e -> e + "_X");                // append _X to every element
        System.out.println("replaceAll: " + list);

        // ✅ forEach
        System.out.println("forEach:");
        list.forEach(System.out::println);             // method reference print

        // ✅ RemoveIf
        list.removeIf(e -> e.startsWith("A"));         // remove entries starting with A
        System.out.println("removeIf: " + list);
    }
}
