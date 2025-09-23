package Interface.Functional_Interface;


@FunctionalInterface
interface Bird{
    public void fly(int height);
}

public class Lambda {
    public static void main(String[] args) {
        Bird eagle = (int height)->{
            System.out.printf("Eagle flies at %d height\n", height);
        };

        eagle.fly(10);
    }
}
