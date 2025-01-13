package OOPS;

abstract class Animal {
    abstract void walk();
};

class Dog extends Animal {

    void walk() {
        System.out.println("Dog is walks on 4 legs");
    }
};

class Human extends Animal {

    void walk() {
        System.out.println("Human is walks on 2 legs");
    }

}

public class Abstract_Class {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();

        // Animal a = new Animal(); // Error: abstract class cannot be objectifired

        Human h = new Human();
        h.walk();
    }
}
