package OOPS;

class Demo {

    public void get(int a) {
        System.out.println(a);
    }

    public void get(String a) {
        System.out.println(a);
    }

    public void get(int a, int b) {

        System.out.println(a + b);

    }
}

public class Method_Overloading {

    public static void main(String[] args) {
        Demo d = new Demo();

        d.get(10, 7);
    }

}
