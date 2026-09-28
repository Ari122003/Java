package Methods;

// final keyword in Java means: "this thing cannot be changed afterwards."
// Here, final is applied to a method, so the method cannot be overridden in a subclass.
class Bird {
    // This method is final.
    // It defines the behavior for every Bird object at the base class level.
    // Since it is final, no subclass can replace its implementation.
    public final void transportaion() {
        System.out.println("Flying bird");
    }
}

class Eagle extends Bird {
    // This class is allowed to inherit from Bird.
    // However, it is NOT allowed to override transportaion().
    // If we try to write:
    //
    // @Override
    // public void transportaion() {
    //     System.out.println("Eagle flying fast");
    // }
    //
    // Java will give a compile-time error because final methods cannot be overridden.
    // final methods protect the original behavior from being changed in subclasses.
}

public class Final_Methods {

    public static void main(String[] args) {
        // A subclass object is assigned to a parent reference type.
        // This is valid because Eagle IS-A Bird.
        Bird b = new Eagle();

        // Even though the actual object is an Eagle, the method call uses the final method
        // defined in Bird. The compiler and JVM do not allow a different override.
        // So the output is still: Flying bird
        b.transportaion();

        // Principle in simple words:
        // final method = fixed behavior
        // Once a method is declared final in the parent class,
        // all child classes must use that exact implementation.
    }
}
