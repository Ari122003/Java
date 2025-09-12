package Classes.Nested_Classes;

class OuterClass2 {
    int instanceVariable = 10;
    static int staticVariable = 20;

    class InnerClass {
        public void innerMethod() {
            System.out.println(instanceVariable+staticVariable);
        }
    }
}

public class Member_inner_class {
    public static void main(String[] args) {
        OuterClass2 outerObj    = new OuterClass2();

        OuterClass2.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.innerMethod();
    }
}
