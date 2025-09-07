package Access_Specifier;

public class Test {

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.myMethod(); // Allowed: public method (same package)
        demo.myProtectedMethod(); // Allowed: protected method (same package)
//        demo.myPrivateMethod(); // Not Allowed: private method

    }
}

class TestDemo extends Demo {
    void test(){
//        myPrivateMethod(); private can not be accessed in sub
        myMethod();
        myProtectedMethod();
    }
}