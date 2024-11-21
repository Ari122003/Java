package OOPS;

class Car1 {

    private static int count = 0;

    public static void funcc() {
        System.out.println("Static method inside Car class");
    }

}

public class SM {
    public static void main(String[] args) {
        Car1.funcc();
    }

}
