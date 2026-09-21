package OOPS.Polymorphism;

// Method overloading means defining multiple methods with the same name but
// different parameter lists. The compiler selects the matching overload at
// compile time based on the arguments supplied.
class Calculator {

    // Overload 1: accepts exactly two int values.
    int sum(int a, int b) {
        return a + b;
    }

    // Overload 2: accepts exactly two double values.
    // Its parameter types differ from the first overload.
    double sum(double a, double b) {
        return a + b;
    }

    // Overload 3: accepts any number of int values through varargs.
    int sum(int... a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }

}

public class Method_Overloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Two int arguments select sum(int, int).
        System.out.println(calc.sum(5, 7));

        // Two double arguments select sum(double, double).
        System.out.println(calc.sum(5.2, 7.1));

        // More than two int arguments select the variable-length overload.
        System.out.println(calc.sum(5, 7, 9, 11));
    }

}
