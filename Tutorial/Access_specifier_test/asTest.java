package Access_specifier_test;

import Access_Specifier.Demo;

public class asTest {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.myMethod();
//        demo.myProtectedMethod(); proteced method can not be accessed from different package
//        demo.myPrivateMethod(); private not accessed from other pacakges
    }
}

class OutSideTest extends Demo {
    public void func(){
        myMethod();
        myProtectedMethod();
//        myPrivateMethod(); private cant be accessed from subclass in different package
    }
}