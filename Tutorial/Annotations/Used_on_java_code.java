package Annotations;

@Deprecated
class Car{

}

class Animal{
    public void run(){
        System.out.println("Animal run");
    }
}
class Horse extends Animal{
    @Override
    public void run(){
        System.out.println("Horse run");
    }

}

@FunctionalInterface
interface Bird{
    void fly();
}

public class Used_on_java_code {
    public static void main(String[] args) {

    }
}
