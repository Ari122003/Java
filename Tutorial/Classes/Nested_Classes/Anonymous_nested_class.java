package Classes.Nested_Classes;

abstract class Car{

    public abstract void pressBreak();
}

public class Anonymous_nested_class {
    public static void main(String[] args) {
        Car car = new Car(){
            @Override
            public void pressBreak() {
                System.out.println("Press break");
            }
        };

        car.pressBreak();
    }
}
