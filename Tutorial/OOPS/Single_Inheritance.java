
class Calculator{

    protected int x = 999;

    void add(int a, int b){
        System.out.println(a+b);
    }
    void subtract(int a, int b){

        System.out.println(a-b);
    }
}

class AdvancedCalculator extends Calculator{
    void multiply(int a, int b){

        System.out.println(a*b);
    }
    void divide(int a, int b){

        System.out.println((float)a/b);
    }
}


public class Single_Inheritance {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.subtract(20,5);

        AdvancedCalculator calc2 = new AdvancedCalculator();

        System.out.println(calc2.x);

        calc2.add(10, 20);
        calc2.divide(10,9);
    }
}
