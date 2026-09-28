package Methods;

// An abstract class represents a general idea or category.
// It can contain abstract methods, but it cannot be instantiated directly.
abstract class Animal{

    // An abstract method declares WHAT every Animal must do,
    // but does not define HOW it does it.
    // The method has no body, so a concrete child class must implement it.
    public abstract void eat();
}

class Dog extends Animal{
    // Dog inherits the requirement to provide an eat() method from Animal.
    // @Override confirms that this method implements Animal.eat().
    @Override
    public void eat() {
        // Dog provides the specific HOW for the general Animal behavior.
        System.out.println("Dog eat");
    }
}

public class Abstract_Methods {
    public static void main(String[] args) {
        // This is abstraction in use:
        // - Animal is the reference type, so the code depends on the general contract.
        // - Dog is the actual object, so Java uses Dog's implementation at runtime.
        // An Animal object cannot be created with "new Animal()" because Animal is abstract.
        Animal a = new Dog();

        // The compiler checks that eat() is declared in Animal.
        // At runtime, dynamic method dispatch selects Dog.eat(), which prints "Dog eat".
        a.eat();

        // Conceptual memory view:
        //
        // Stack (main method)              Heap
        // +-----------+                    +-------------+
        // | a --------|------------------> | Dog object  |
        // +-----------+                    +-------------+
        //
        // The reference is typed as Animal, but it points to a Dog object.
        // This allows the program to hide Dog's implementation details behind
        // the simpler Animal contract and makes other Animal subclasses possible.
    }
}
