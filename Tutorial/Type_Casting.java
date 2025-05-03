

public class Type_Casting {
    public static void main(String[] args) {
        int b = 100;

        byte a = (byte)b;

        int c = a; // but it works

        //small to bit conversion works but big to small does not work

        float x = 5.6f;

        int y = (int)x;




        System.out.println(c);
    }
}