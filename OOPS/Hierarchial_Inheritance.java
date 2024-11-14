package OOPS;

class Car {
    int number;
}

class FamilyCar extends Car {
    String brand;
    int price;

    FamilyCar(int number, String brand, int price) {
        this.number = number;
        this.brand = brand;
        this.price = price;
    }
}

class SportCar extends Car {
    String brand;
    int price;

    SportCar(int number, String brand, int price) {
        this.number = number;
        this.brand = brand;
        this.price = price;
    }
}

public class Hierarchial_Inheritance {

    public static void main(String[] args) {

        FamilyCar fc = new FamilyCar(123, "Marcedes", 2000000);

        SportCar sc = new SportCar(456, "Ferrari", 3000000);

    }

}
