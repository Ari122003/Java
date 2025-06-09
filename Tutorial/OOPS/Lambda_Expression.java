package OOPS;

interface I{
    public void print(int a);
}

interface Int{
    public int add(int a,int b);
}

public class Lambda_Expression {
    public static void main(String[] args) {
        I i = new I(){
            public void print(int a) {
                System.out.println(a);
            }
        };

       I obj = (int a)->{System.out.println(a);};
       obj.print(1);




       Int calc = new Int(){
           public int add(int a,int b) {
               return a+b;
           }
       };

       Int clac2 = (a,b)->a+b;

       System.out.println(calc.add(2,3));
    }
}
