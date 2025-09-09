package Constructors;

class ChainingTest{
    int roll;
    String name;

    public ChainingTest(){
        this(10);
        System.out.println("Blank constructor");


    }

    public ChainingTest(int roll){
        this("Aritra");
        this.roll = roll;
        System.out.println("Roll setting constructor");
    }
    public ChainingTest(String name){
        this.name = name;
        System.out.println("Name setting constructor");
    }
}

public class Chaining {
 public static void main(String[] args) {
     ChainingTest test = new ChainingTest();

     System.out.println(test.roll);
     System.out.println(test.name);
 }
}

