package OOPS;

class My{

    public void func(){
        System.out.println("My function");
    }
}

abstract class Ship{
    public abstract void move();
}

public class Annonymous_Overriding {
    public static void main(String[] args) {
        // For non abstract method
        My m = new My(){
            public void func(){
                System.out.println("My function is overridden");
            }
        };

        m.func();


        // For abstract method

        Ship ship = new Ship(){
            public void move(){
                System.out.println("Ship is moving........");
            }
        };

        ship.move();
    }
}
