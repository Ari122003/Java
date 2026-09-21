package OOPS.Inheritance;

// Multilevel inheritance forms a chain of inheritance:
// Calculator -> AdvancedCalculator -> SuperCalculator.
// SuperCalculator indirectly inherits the members of Calculator through
// AdvancedCalculator, and adds its own power() method.
class SuperCalculator extends AdvancedCalculator {

    // This method is specific to SuperCalculator.
    void power(double a, double b) {
        System.out.println(Math.pow(a, b));

    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        // The object is created from the last class in the inheritance chain.
        SuperCalculator sc = new SuperCalculator();

        // power() is declared in SuperCalculator and is available to its object.
        sc.power(5, 6);
    }
}
