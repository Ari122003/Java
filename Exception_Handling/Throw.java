package Exception_Handling;

public class Throw {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };

        if (arr.length < 5) {
            throw new ArrayIndexOutOfBoundsException("Size is less than 5");
        }

    }
}
