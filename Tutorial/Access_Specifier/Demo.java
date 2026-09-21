package Access_Specifier;

/*
 * Java access specifiers control which classes can use a member.
 * public    -> accessible from any class in any package.
 * protected -> accessible in this package and in subclasses (even in another package).
 * default   -> accessible only within this package; write no keyword for it.
 * private   -> accessible only inside this class.
 */
public class Demo {

    // public: any class that can see Demo can call this method.
    public void myMethod() {
        System.out.println("Public method");
    }

    // protected: classes in Access_Specifier and subclasses can call this method.
    protected void myProtectedMethod() {
        System.out.println("Protected method");
    }

    // No keyword means package-private (also called default) access.
    // Only classes declared in the Access_Specifier package can call this method.
    void myDefaultMethod() {
        System.out.println("Default (package-private) method");
    }

    // private: only code inside Demo can call this method.
    private void myPrivateMethod() {
        System.out.println("Private method");
    }
}

