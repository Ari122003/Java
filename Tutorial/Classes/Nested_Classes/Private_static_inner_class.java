package Classes.Nested_Classes;

class OuterClasss {
    static int staticVariable=10;

    private static class InnerClass {
        public void innerMethod() {
            System.out.print(staticVariable);
        }
    }

    public void createInnerClassObject() {
        InnerClass innObj = new InnerClass();
        innObj.innerMethod();
    }

}

public class Private_static_inner_class {
    public static void main(String[] args) {

        OuterClasss outerObj = new OuterClasss();

        outerObj.createInnerClassObject();

    }
}
