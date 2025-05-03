package OOPS;

class X{

    public int a = 10;

   public void func(){
        System.out.println("From X method");
   }

   public class Y{
       public void method(){
           System.out.println("From Y method");
       }
   }

   public static class Z{
       public void show (){
           System.out.println("From Z method");
       }
   }
}

public class Inner_Class {

    public static void main(String[] args) {

        X obj = new X();

        // For non static class
        X.Y mmm = obj.new Y();
        mmm.method();


        // For static class

        X.Z aaa = new X.Z();
        aaa.show();


    }



}
