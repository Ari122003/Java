package Classes;

// Abstract classes are classes that cannot be instantiated directly.
// They are used to define a common blueprint for related classes.
// A class becomes abstract by using the abstract keyword.
// Abstract classes may contain:
// 1. normal methods
// 2. abstract methods
// 3. variables
// 4. constructors

// This is an abstract class named MusicInstrument.
// It acts like a common parent for all musical instruments.
abstract class MusicInstrument {

    // An abstract method has no body.
    // It is declared in the abstract class to force subclasses to implement it.
    // Any class that extends an abstract class must provide implementation for all
    // abstract methods,
    // unless the subclass is also declared abstract.
    public abstract void play();
}

// Guitar is a concrete subclass of MusicInstrument.
// Because the parent class has an abstract method, Guitar must implement it.
class Guitar extends MusicInstrument {

    // @Override tells Java that this method is overriding the abstract method from
    // the parent class.
    @Override
    public void play() {
        // This method defines how a Guitar plays.
        System.out.println("Guitar");
    }
}

// This class contains the main method, which is the entry point of the program.
public class Abstract_Class {

    public static void main(String[] args) {
        // Creating an object of the subclass Guitar.
        // We cannot create an object of an abstract class directly.
        Guitar guitar = new Guitar();

        // Calling the overridden play() method.
        guitar.play();
    }
}

// Summary:
// - abstract class cannot be instantiated
// - abstract methods have no implementation
// - subclasses must implement the abstract methods
// - abstract classes help define a common structure for a group of related
// classes
// - they are useful for achieving code reusability and standardization

// Example in simple words:
// MusicInstrument says: "Every instrument must have a play() method"
// Guitar says: "I am a Guitar, so here is how I play"
