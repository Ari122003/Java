package Methods;


class Calculate{
    public static int sum(int ...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }

        return sum;
    }
}

public class Variable_Arguments {
    public static void main(String[] args) {
        System.out.println(Calculate.sum(10,20,30,40,50));
    }
}
