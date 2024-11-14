package OOPS;

class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;

    }

    public void displayType() {
        System.out.println("Type: " + type);
    }

}

class SportsCar extends Vehicle {
    String brand;

    public SportsCar(String type, String brand) {
        super(type);

        this.brand = brand;

    }

    public void displayBrand() {
        super.displayType();
        System.out.println("Brand: " + brand);
    }

}

public class Super_KeyWord {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar("Sedan", "Mercedes");
        sc.displayBrand();
    }
}
