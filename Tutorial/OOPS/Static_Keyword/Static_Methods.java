package OOPS.Static_Keyword;

class Hello {
    /*
     * A static variable belongs to the class, not to an individual object.
     * Therefore, every Hello object shares the same value of x.
     */
    static int x = 5;

    // An instance variable belongs to each separate Hello object.
    int a = 10;

    /*
     * An instance method runs for a specific Hello object.
     * Because it has an implicit reference to that object (this), it can
     * access both the shared static variable x and the instance variable a.
     */
    void display1() {
        // x is shared by the Hello class.
        System.out.println(x);

        // a belongs to the particular Hello object calling display1().
        System.out.println(a);
    }

    /*
     * A static method belongs to the Hello class rather than to one object.
     * It is useful here because display2() only needs the shared value x.
     *
     * A static method has no implicit this reference, so it cannot directly
     * access the instance variable a. It can access a only through an
     * explicitly supplied Hello object.
     */
    static void display2() {
        // Static methods can directly access static members.
        System.out.println(x);

        // This would cause a compile-time error because a is not static:
        // System.out.println(a);
    }
}

public class Static_Methods {
    public static void main(String[] args) {
        // Create a Hello object so its instance method can be called.
        Hello h = new Hello();

        // Instance methods are called through an object reference.
        h.display1();

        // Static methods are called through the class name; no object is
        // required because display2() uses only class-level data.
        Hello.display2();

    }
}
