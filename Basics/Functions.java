package Basics;

public class Functions {

    public static int sum(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {

        int res = sum(12);

        System.out.println("Sum is :" + (res));
    }

}
