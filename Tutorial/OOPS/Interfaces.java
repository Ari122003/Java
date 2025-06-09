package OOPS;

interface Animal{
    public void walk();
    public void eat();
}

class Dog implements Animal{
    public void walk() {
        System.out.println("Dog is walking");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.walk();
        dog.eat();
    }
}
