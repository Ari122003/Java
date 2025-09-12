package Classes.Nested_Classes;

class OuterClass {
    int instanceVariable = 10;
    static int staticVariable = 20;

    static class InnerClass {
        public void innerInstanceMethod() {
            System.out.print(staticVariable);
        }
    }
}

public class Nested_Static_class {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClassObject = new OuterClass.InnerClass();

        innerClassObject.innerInstanceMethod();
    }
}
