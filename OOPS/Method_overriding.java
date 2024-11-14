package OOPS;

class Parent {
    public void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child class method");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();
    }
}
