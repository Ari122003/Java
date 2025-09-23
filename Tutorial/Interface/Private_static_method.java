package Interface;

interface MyInterface {
    void myMethod(); // works as public abstract method

    default void defaultMethod(){
        staticMethod();
        privateMethod(); // Java-8 feature
        privateStaticMethod();
    }

    public static void staticMethod(){
        privateStaticMethod();
    }

    private void privateMethod(){}// Java-9 feature

    private static void privateStaticMethod(){
            // java 9 feature
    }

}

public class Private_static_method {
    public static void main(String[] args) {
        MyInterface.staticMethod();
    }
}
