public class DataTypes {
    public static void main(String[] args) {
        byte a = 100;  // byte: 1 byte (8 bits), Range: -2^7 to 2^7 - 1
        short b = 10000;  // short: 2 bytes (16 bits), Range: -2^15 to 2^15 - 1
        int c = 100000;  // int: 4 bytes (32 bits), Range: -2^31 to 2^31 - 1
        long d = 10000000000L;  // long: 8 bytes (64 bits), Range: -2^63 to 2^63 - 1
        float e = 10.5f;  // float: 4 bytes (32 bits), Range: ~2^(-128) to ~2^128
        double f = 10.5555;  // double: 8 bytes (64 bits), Range: ~2^(-1024) to ~2^1024
        char g = 'A';  // char: 2 bytes (16 bits, Unicode), Range: 0 to 2^16 - 1
        boolean h = true;  // boolean: 1 bit (size varies, typically 1 byte), Range: true or false
        String i = "Hello, Java!";  // String (not primitive), size depends on characters (2 bytes each in UTF-16)

       System.out.println(d);
    }
}
