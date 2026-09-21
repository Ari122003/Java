package OOPS.Inheritance;

// Parent (super) class: it contains the common calculator data and operations.
class Calculator {

    // 'protected' lets child classes access this inherited field directly.
    protected int x = 999;

    // These methods are inherited by any class that extends Calculator.
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void subtract(int a, int b) {

        System.out.println(a - b);
    }
}

// AdvancedCalculator is the child (sub) class.
// 'extends Calculator' creates single inheritance: one child inherits from one
// parent.
class AdvancedCalculator extends Calculator {
    // This is an additional feature defined only in the child class.
    void multiply(int a, int b) {

        System.out.println(a * b);
    }

    void divide(int a, int b) {

        System.out.println((float) a / b);
    }
}

// The program starts here and demonstrates how inherited members are used.
public class Single_Inheritance {
    public static void main(String[] args) {
        // A Calculator object can use the methods declared in Calculator.
        Calculator calc = new Calculator();
        calc.subtract(20, 5);

        // An AdvancedCalculator object has its own methods and inherits Calculator's
        // members.
        AdvancedCalculator calc2 = new AdvancedCalculator();

        // x belongs to Calculator, but calc2 can access it because it inherited the
        // field.
        System.out.println(calc2.x);

        // add() is inherited from Calculator; divide() belongs to AdvancedCalculator.

        calc2.add(10, 20);
        calc2.divide(10, 9);
    }
}
