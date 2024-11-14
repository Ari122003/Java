package OOPS;

class Vehicle {
    String powered;

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Vehicle {

    int cc;

    public Bike() {

    }

    public void quality() {
        System.out.println("Bike has two wheels...");
    }
}

class Enfield extends Bike {
    int price;

    public void sound() {
        System.out.println("Enfield sounds loud...");
    }

    Enfield(String type, int cc, int price) {
        this.powered = type; // Ensure 'powered' is accessible
        this.cc = cc;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Type: " + powered);
        System.out.println("CC: " + cc);
        System.out.println("Price: " + price);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Enfield e = new Enfield("Engine", 350, 100000);
        e.start();
        e.quality();
        e.sound();
        e.getInfo();
    }
}
