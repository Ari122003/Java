
class Adder{
    int add(int a ,int b){
        return a+b;
    }
}





public class Methods {
    int add(int a ,int b){
        return a+b;
    }
    public static void main(String[] args) {

        Methods m = new Methods();
        System.out.println(m.add(5,2));

        Adder ad = new Adder();


        System.out.println(ad.add(4,8));
    }
}
