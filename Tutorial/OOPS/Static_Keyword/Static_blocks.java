package OOPS.Static_Keyword;

class SB {
    // Static fields belong to the class and are initialized when the class
    // is initialized, before an object of SB is created.
    static int x;

    /*
     * CONCEPT: Static initialization block
     *
     * A static block runs automatically when the JVM initializes this class.
     * It is used here to assign the class-level value x and show exactly when
     * class initialization happens.
     *
     * A class's static initialization runs once per class loading, before
     * main can use the class or before the first object is constructed. If a
     * static block throws an exception, class initialization fails and later
     * use of the class can produce an initialization error.
     */
    static {
        // Set up shared class state before SB is used.
        x = 100;

        // This message proves that the block runs during class initialization.
        System.out.println("Static block");
    }

    SB() {
        // A constructor runs when an SB object is created, after static setup.
        System.out.println("Constructor");
    }

}

public class Static_blocks {
    public static void main(String[] args) throws ClassNotFoundException {
       

        /*
         * Class.forName(...) loads the named class by its fully qualified
         * name. Loading SB triggers its static initialization, so the static
         * block runs even though no SB object is created.
         *
         * The package name is required here; using only "SB" would cause a
         * ClassNotFoundException because SB is in OOPS.Static_Keyword.
         * Class.forName declares that checked exception, so main propagates
         * it with throws ClassNotFoundException.
         */
        Class.forName("OOPS.Static_Keyword.SB");

    }
}
