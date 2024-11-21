package OOPS;

class Vehicle1 {

    int price;

    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike1 extends Vehicle1 {

    public void getDetails() {
        System.out.println("Bike has 2 wheels");
        System.out.println(price);
    }

    Bike1(int price) {
        this.price = price;
    }

}

public class Single_Inheritance {

    public static void main(String[] args) {

        // Bike b = new Bike(100);
        Vehicle1 v = new Bike1(999);

        v.run();

        // b.getDetails();
        // b.run();
    }

}
