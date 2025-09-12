package Classes.Nested_Classes;

class OuterClass3 {

    int instanceVariable = 10;
    static int staticVariable = 20;

    public void func(){
        int funcVariable = 30;

        class InnerClass {
           final int innerVariable = 40;

            public void innerMethod() {
                System.out.println(instanceVariable+staticVariable+funcVariable+innerVariable);
            }
        }

        InnerClass innObj = new InnerClass();
        innObj.innerMethod();
    }
}

public class Local_nested_class {
    public static void main(String[] args) {
        OuterClass3 obj = new OuterClass3();
        obj.func();
    }
}
