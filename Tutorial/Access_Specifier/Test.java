package Access_Specifier;

public class Test {

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.myMethod();          // Allowed: public is available everywhere.
        demo.myProtectedMethod(); // Allowed: protected is available in the same package.
        demo.myDefaultMethod();   // Allowed: default access is available in the same package.

        // Not allowed: private members can be used only inside the Demo class.
        // demo.myPrivateMethod();

    }
}

class TestDemo extends Demo {
    void test() {
        // A subclass inherits public and protected members.
        myMethod();
        myProtectedMethod();

        // Not allowed: a subclass cannot access Demo's private member.
        // myPrivateMethod();
    }
}
