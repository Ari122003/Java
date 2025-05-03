package OOPS;
 class SuperCalculator extends AdvancedCalculator{

    void power(double a, double b){
        System.out.println(Math.pow(a,b));

    }
 }


public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        SuperCalculator sc = new SuperCalculator();

        sc.power(5,6);
    }
}
