package Interface.Functional_Interface;

@FunctionalInterface
public interface MyFunctionalInterface {
    public void myMethod();
}


// Way 1
class MyClass implements MyFunctionalInterface {
    @Override
    public void myMethod() {
        System.out.println("My Method");
    }
}

// Way 2
class HerClass  {
    void func(){
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Her");
            }
        };

        mfi.myMethod();

    }

}