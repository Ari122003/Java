package OOPS;

// An inner class is a class declared inside another class.
// The outer class groups related data and behavior, while the nested class
// can represent a helper or component that belongs to that outer class.
class X {

    public int a = 10;

   public void func() {
        System.out.println("From X method");
   }

   // Y is a non-static inner class, also called a member inner class.
   // Every Y object is associated with a particular X object.
   public class Y {
       public void method() {
           System.out.println("From Y method");
       }
   }

   // Z is a static nested class. It belongs to the X class itself rather than
   // to one specific X object, so it does not need an enclosing X instance.
   public static class Z {
       public void show() {
           System.out.println("From Z method");
       }
   }
}

public class Inner_Class {

    public static void main(String[] args) {

        // Create an object of the outer class. This object is required before
        // creating a non-static inner-class object.
        X obj = new X();

        // For a non-static inner class, use:
        // OuterClass.InnerClass variable = outerObject.new InnerClass();
        // The obj.new Y() syntax connects mmm to the specific X object above.
        X.Y mmm = obj.new Y();
        mmm.method();


        // A static nested class is created using the outer class name only.
        // No X object is needed because Z is associated with the class, not
        // with an individual X instance.

        X.Z aaa = new X.Z();
        aaa.show();


    }



}
