
class Hello{
     static int x = 5;

    int a  = 10;

    void display1(){
        System.out.println(x);
        System.out.println(a);
    }

    static void display2(){
        System.out.println(x);
//        System.out.println(a); static methods can only access static variables

    }
}


public class Static_Methods {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.display1();
        Hello.display2();

    }
}
