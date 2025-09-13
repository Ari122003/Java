package Classes.Generic_Classes;

public class Generic_Method {
    public static <T> void print(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        print(1);
        print("Hello");
    }
}
