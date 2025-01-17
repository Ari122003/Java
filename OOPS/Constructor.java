package OOPS;

class Dog1 {
    String breed;
    int age;

    // Constructor
    Dog1() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Dog1(String breed, int age) {
        this.breed = breed;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void getInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

}

public class Constructor {
    public static void main(String[] args) {

        Dog1 d1 = new Dog1("Lab", 10);
        d1.getInfo();

        // Dog d2 = new Dog();
    }

}
