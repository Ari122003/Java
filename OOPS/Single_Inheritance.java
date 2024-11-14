package OOPS;

class Vehicle {

    int price;

    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

    public void getDetails() {
        System.out.println("Bike has 2 wheels");
        System.out.println(price);
    }

    Bike(int price) {
        this.price = price;
    }

}

public class Single_Inheritance {

    public static void main(String[] args) {

        // Bike b = new Bike(100);
        Vehicle v = new Bike(999);

        v.run();

        // b.getDetails();
        // b.run();
    }

}
