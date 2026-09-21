package OOPS.Polymorphism;

// The parent class provides the original implementation of method().
class C {
    void method() {
        System.out.println("From C");
    }
}

// D inherits from C and overrides method() by using the same method name,
// return type, and parameter list with a different implementation.
class D extends C {
    void method() {
        System.out.println("From D");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        // The object is a D, so the overridden method in D is called.
        D d = new D();
        d.method();
    }
}
