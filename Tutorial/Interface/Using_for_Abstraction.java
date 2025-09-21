package Interface;

interface Car{
    public void drive();
}
class SportCar implements Car{
    @Override
    public void drive() {
        System.out.println("SportCar drive");
    }
}
public class Using_for_Abstraction {
}
