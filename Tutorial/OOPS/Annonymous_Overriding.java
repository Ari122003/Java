package OOPS;

// An anonymous class is a class without a declared name, created for one-time use.
class My {

    public void func() {
        System.out.println("My function");
    }
}

// An abstract class can declare behavior that a child class must implement.
abstract class Ship {
    public abstract void move();
}

public class Annonymous_Overriding {
    public static void main(String[] args) {
        // The anonymous class extends My and overrides its non-abstract func()
        // method. The new behavior is used only by this My object.
        My m = new My() {
            public void func() {
                System.out.println("My function is overridden");
            }
        };

        // Dynamic dispatch calls the overridden implementation in the anonymous class.
        m.func();


        // The anonymous class extends Ship and provides the required implementation
        // of the abstract move() method, so no named Ship subclass is needed.

        Ship ship = new Ship() {
            public void move() {
                System.out.println("Ship is moving........");
            }
        };

        // This call uses the implementation supplied by the anonymous class.
        ship.move();
    }
}
