package OOPS;



class SB{
    static  int x;


    static{
        x=100;
        System.out.println("Static block");
    }

    SB(){
        System.out.println("Constructor");
    }

}

public class Static_blocks {
    public static void main(String[] args) throws ClassNotFoundException
    {
//        SB sb1 = new SB();
//        SB sb2 = new SB(); static block runs once

        Class.forName("SB"); // Static block loads when a class loads

    }
}
