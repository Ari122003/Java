package Referance_Variables;

public class Strings {

    public static void main(String[] args) {
      String s1 = "hello";
        String s2 = "hello";// they points same "hello" in string constant pool

        String s3 = new String("hello"); // creates a new memory in heap

        System.out.println(s1==s3);

    }
}
