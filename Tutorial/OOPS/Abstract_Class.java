package OOPS;

abstract class Car{

    public abstract void drive();// Abstract methods must be placed in a abstract class
}

class Swift extends Car{
    public void drive(){ // Sub class of an abstrct class must override th abstract
        // methods of its parents
        System.out.println("Swift is being driven......");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
//        Car car = new Car() {} we can not make object of abstract classes

        Swift swift = new Swift();
        swift.drive();
    }
}
