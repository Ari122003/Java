package OOPS;

class Vehicle2 {
    String type;
    int number = 123;

    public Vehicle2(String type) {
        this.type = type;

    }

    public void displayType() {
        System.out.println("Type: " + type);
    }

}

class SportsCar extends Vehicle2 {
    String brand;

    public SportsCar(String type, String brand) {
        super(type);

        this.brand = brand;

    }

    public void displayBrand() {
        super.displayType();
        System.out.println("Brand: " + brand);
        System.out.println("Number: " + super.number);
    }

}

public class Super_KeyWord {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar("Sedan", "Mercedes");
        sc.displayBrand();
    }
}
