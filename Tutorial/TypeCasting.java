public class TypeCasting {
    class TypeCastingDemo {
    public static void main(String[] args) {
        // ---------- Upcasting (Widening Conversion) ----------
        // ✅ Done automatically by Java (safe, no data loss in most cases)
        
        byte b = 10;              // 1 byte
        short s = b;              // byte → short (upcast) → 10
        int i = s;                // short → int (upcast) → 10
        long l = i;               // int → long (upcast) → 10
        float f = l;              // long → float (upcast, may lose precision for very large numbers) → 10.0
        double d = f;             // float → double (upcast, safe) → 10.0

        // ---------- Downcasting (Narrowing Conversion) ----------
        // ❌ Must be done manually using (type), may cause data loss
        
        double d2 = 99.99;        // 8 bytes
        float f2 = (float) d2;    // double → float (downcast, may lose precision) → 99.99
        long l2 = (long) f2;      // float → long (downcast, fractional part lost) → 99
        int i2 = (int) l2;        // long → int (downcast, may overflow if value > int range) → 99
        short s2 = (short) i2;    // int → short (downcast, may overflow if > 32767) → 99
        byte b2 = (byte) s2;      // short → byte (downcast, may overflow if > 127) → 99

        // ---------- Special Cases ----------
        int big = 130;
        byte b3 = (byte) big;     // int → byte (downcast, overflow) → -126 (because 130 - 256 = -126)

        float f3 = 12345.67f;
        int i3 = (int) f3;        // float → int (fractional part lost) → 12345

        char c1 = 'A';            // Unicode value of 'A' = 65
        int i4 = c1;              // char → int (upcast, safe) → 65
        char c2 = (char) (i4 + 1); // int → char (downcast) → 'B'

        // ---------- Object Casting ----------
        // Upcasting (always safe, automatic)
        Object obj = "Hello";     // String upcasted to Object

        // Downcasting (must be explicit, runtime check)
        String str = (String) obj; // Object → String (safe here, since obj actually holds a String)
        
        // Unsafe downcasting (will throw ClassCastException at runtime)
        // Integer num = (Integer) obj;  // ❌ obj is a String, not Integer
    }
}

}
