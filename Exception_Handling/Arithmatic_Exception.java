package Exception_Handling;

public class Arithmatic_Exception {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
