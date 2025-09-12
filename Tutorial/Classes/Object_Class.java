package Classes;

class Person {
    String name;
}

public class Object_Class {
    public static void main(String[] args) {
        Object p = new Person();

        System.out.println(p.getClass());

    }
}
