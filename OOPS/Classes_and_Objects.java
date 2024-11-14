package OOPS;

class Car {

    String brand;
    int quantity;

    public void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
    }
}

public class Classes_and_Objects {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.quantity = 5;
        c1.getInfo();

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.quantity = 3;
        c2.getInfo();

    }

}
