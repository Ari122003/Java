package Methods;

// Variable arguments (varargs) means a method can accept a variable number of arguments.
// The syntax is "int ...a" which is internally treated as int[] a.
class Calculate {
    // A method that can receive 0 or more integers.
    // Java internally converts the arguments into an array.
    // Example: Calculate.sum(10, 20, 30) is equivalent to sum(new int[]{10, 20, 30}).
    public static int sum(int ...a) {
        int sum = 0;

        // Enhanced for loop iterates through every number in the array.
        // The variable i receives each element one by one.
        for (int i : a) {
            sum += i; // add the current number to the running total
        }

        return sum; // return the final total
    }
}

public class Variable_Arguments {
    public static void main(String[] args) {
        // Calling the method with many arguments:
        // Java creates an int[] internally: [10, 20, 30, 40, 50]
        // Then the method loops through all values and adds them.
        System.out.println(Calculate.sum(10, 20, 30, 40, 50));

        // Output: 150
        // Explanation:
        // 10 + 20 + 30 + 40 + 50 = 150

        // Why varargs is useful:
        // - You do not need to create an array manually every time.
        // - You can pass any number of matching arguments.
        // - It is useful for methods like sum(), print(), format(), etc.

        // Important rule:
        // A varargs parameter must be the last parameter in the method signature.
        // Example: void test(String name, int ...numbers)
    }
}
