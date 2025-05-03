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
        super(10); // Calls constructor of parent class
        System.out.println("From B");
    }
}

public class Super_KeyWord {
    public static void main(String[] args) {
        B b = new B();
    }
}
