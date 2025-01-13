package Factorial;

public class GetFact {

    public static int calcFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calcFact(n - 1);

    }

}
