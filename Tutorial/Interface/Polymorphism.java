package Interface;

interface Animal{
    public void eat();
}

class Dog implements Animal{
@Override
   public void eat(){
        System.out.println("Dog eat");
    }
}

class Cat implements Animal{
    @Override
    public void eat(){
        System.out.println("Cat eat");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
    }
}
