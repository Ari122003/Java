package OOPS;
class myClass{
    int x=100;
}



public class Seperate_Class {
    public static void main(String[] args) {

        myClass mc = new myClass();

        System.out.println(mc.x);

        mc.x = 200;
        System.out.println(mc.x);
    }
}