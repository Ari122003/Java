package OOPS;

/*
 * A constructor initializes an object at the moment the object is created.
 *
 * Rules to remember:
 * 1. Its name must be exactly the same as its class name.
 * 2. It has no return type--not even "void".
 * 3. It runs automatically when the new keyword creates an object.
 * 4. Constructors can receive parameters and can be overloaded.
 * 5. Constructors are not inherited or overridden like ordinary methods.
 */
class Car {
    int speed;

    // This is a no-argument (no-arg) constructor.
    // It supplies a default value whenever a Car is created with: new Car().
    public Car() {
        speed = 200;
    }
}

class Bike {

    int speed;

    // This is a parameterized constructor. The caller supplies the initial
    // speed, for example: new Bike(100).
    public Bike(int speed) {
        // "this.speed" is the instance variable belonging to this Bike object.
        // "speed" is the parameter. "this" removes the naming ambiguity.
        this.speed = speed;
    }
}

public class Constructor {

    public static void main(String[] args) {

        // new allocates memory for an object, then immediately invokes Car().
        Car car = new Car();

        // The value 100 is passed into Bike(int speed) during object creation.
        Bike bike = new Bike(100);

        // Each object has its own instance variable value.
        System.out.println(car.speed);
        System.out.println(bike.speed);

    }
}