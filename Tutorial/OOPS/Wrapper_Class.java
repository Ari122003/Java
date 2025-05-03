package OOPS;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 100;

        Integer b = a; // Auto boxing

        int d = b.intValue(); // Unboxing

        int c = b; // auto unboxing

        String str = "1234";

        int x = Integer.parseInt(str);
    }
}
