package Methods;

abstract class Animal{

    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}

public class Abstract_Methods {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.eat();

    }
}
