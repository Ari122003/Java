package Methods;

// A static method belongs to the class itself, not to any single object.
// This means it is shared by all objects of the class.
class Car {

    // static methods can be called without creating an object of Car.
    // They are used for common behavior that does not depend on instance data.
    public static void horn() {
        System.out.print("Piiiiiiiiiiii");
    }
}

public class Static_Methods {
    public static void main(String[] args) {

        // Calling a static method using the class name:
        // Car.horn();
        // This is different from instance methods, which are usually called with an object.
        // Example: car.horn(); is not valid here because horn() is static.
        Car.horn();

        // Why this works:
        // - The method belongs to the class Car.
        // - It does not need any object's state like color, model, or speed.
        // - JVM loads static members once per class, so they are memory-efficient.

        // Important concept:
        // static method = class-level behavior
        // instance method = object-level behavior

        // Example of instance method (not used here):
        // public void drive() { ... }
        // This would require an object, such as: Car c = new Car(); c.drive();
    }
}
