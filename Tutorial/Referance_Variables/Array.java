package Referance_Variables;

public class Array {
    public static void main(String[] args) {

        // arr is a reference variable: it stores the reference to an int array,
        // rather than storing all five integer values directly.
        int [] arr = new int [5];
        // new int[5] creates an array object with five elements (indexes 0 to 4).
        // Conceptually, memory looks like this:
        //
        // Stack (main method)             Heap (array object)
        // +-----------+                   +-------------------+
        // | arr -------|-----------------> | [0, 0, 0, 0, 0]  |
        // +-----------+                   +-------------------+
        // arr stores a reference to the heap object; it does not store the array itself.

        // The reference arr is used to access and change the element at index 0.
        arr[0] = 5;
        // After this assignment, the heap array is conceptually: [5, 0, 0, 0, 0].

        // Unassigned int elements automatically contain 0, so arr[1] prints 0.
        System.out.println(arr[1]);
    }
}
