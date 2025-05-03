
class C{
    void method(){
        System.out.println("From C");
    }
}
class D extends C{
    void method(){
        System.out.println("From D");
    }
}



public class Method_Overriding {
    public static void main(String[] args) {
        D d = new D();
        d.method();
    }
}
