package OOPS;

class A{
    A(){
        System.out.println("From A");
    }

    A(int a){
        System.out.println("From A "+a);
    }
}

class B extends A{
    B(){
        // super(...) refers to the immediate parent class, A.
        // Here, super(10) calls A's constructor that accepts an int.
        // This is constructor chaining: Java initializes the parent part
        // of a B object before it initializes the B-specific part.
        // The super-constructor call must be the first statement here.
        super(10);
        System.out.println("From B");
    }
}

public class Super_KeyWord {
    public static void main(String[] args) {
        // Creating B first runs A(int), through super(10), and then B().
        B b = new B();
    }
}
