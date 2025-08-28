public class Literals {
    public static int q =100;
       public static void main(String[] args) {
        // ---------- Integer Literals ----------
        int dec = 91;             // Decimal literal (base 10) → 91
        int hex = 0x5B;           // Hexadecimal (0x prefix, base 16) → 91
        int oct = 0133;           // Octal (leading 0, base 8) → 91
        int bin = 0b1011011;      // Binary (0b prefix, base 2) → 91
        int withUnderscore = 1_00_000; // Underscores allowed for readability → 100000

        // ---------- Floating-point Literals ----------
        double d1 = 123.45;       // Decimal floating-point → 123.45
        double d2 = 1.23e2;       // Scientific notation (1.23 × 10^2) → 123.0
        float f1 = 123.45f;       // Float literal (suffix f/F) → 123.45
        double d3 = 1.23D;        // Double literal (suffix d/D, optional) → 1.23

        // ---------- Character Literals ----------
        char c1 = 'A';            // Character literal → 'A'
        char c2 = 65;             // Decimal Unicode value (65) → 'A'
        char c3 = '\u0041';       // Unicode escape sequence (U+0041) → 'A'
        char c4 = '\n';           // Escape sequence (newline) → prints a line break
        char c5 = 91;             // Decimal Unicode (91) → '['

        // ---------- String Literals ----------
        String s1 = "Hello";          // Simple string → "Hello"
        String s2 = "Line1\nLine2";   // Escape sequence → prints Line1, then newline, then Line2

        // ---------- Boolean Literals ----------
        boolean b1 = true;        // Boolean literal → true
        boolean b2 = false;       // Boolean literal → false

        // ---------- Null Literal ----------
        String s3 = null;         // Null literal → no value, reference points to nothing
    }
}
