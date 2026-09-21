package OOPS;

// "Definition of a class: A class is a user-defined blueprint or template used to create objects in Java."
// "A class groups related data, called fields or variables, and related actions, called methods."
// "For example, Car is a class because it describes common properties and actions of all cars."
// "Class characteristic: A class is a logical entity, so writing a class alone does not create an actual car in memory."
// "Class characteristic: A class can contain fields, methods, constructors, blocks, and nested classes."
// "Class characteristic: A class supports encapsulation by keeping data and the methods that use that data together."
// "Class characteristic: Multiple objects can be created from one class, and each object can store different field values."
class Car {
    // "This instance variable represents the state of a Car object by storing its speed."
    // "Each Car object receives its own copy of this non-static field when the object is created."
    int speed = 100;
}

public class Class_and_Object {

    public static void main(String[] args) {

        // "Definition of an object: An object is a real runtime instance of a class."
        // "This statement uses the Car class blueprint to create one object during program execution."
        // "The new keyword allocates memory for the object and invokes the class constructor."
        // "The variable car is a reference variable because it stores the location of the created Car object."
        // "Object characteristic: Every object has identity, which makes it distinct from every other object."
        // "Object characteristic: Every object has state, represented here by the speed field value of 100."
        // "Object characteristic: Every object has behavior, represented by the methods defined in its class."
        // "One class can create many independent objects, such as car1 and car2, with different speed values."
        Car car = new Car();

    }
}
