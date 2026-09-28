package Constructors;

/*
 * Constructor chaining means calling one constructor from another constructor
 * in the same class. In Java, this is done with this(...).
 *
 * Why use it?
 * - It avoids repeating initialization code.
 * - It gives every object one consistent initialization path.
 * - The constructor with the most specific/default values can be reused by
 *   the other constructors.
 */
class ChainingTest {
    int roll;
    String name;

    public ChainingTest() {
        // this(10) calls the constructor that accepts an int.
        // A this(...) call must be the first statement in a constructor.
        this(10);

        // This line runs only after the int constructor has completed.
        System.out.println("Blank constructor");
    }

    public ChainingTest(int roll) {
        // The int constructor delegates name initialization to the String
        // constructor instead of assigning the name a second time here.
        this("Aritra");

        // This assignment happens after the String constructor returns.
        // The parameter and the field have the same name, so this.roll means
        // "the roll field belonging to this object".
        this.roll = roll;
        System.out.println("Roll setting constructor");
    }

    public ChainingTest(String name) {
        // This is the end of the this(...) chain. It initializes the field.
        this.name = name;
        System.out.println("Name setting constructor");
    }
}

public class Chaining {
    public static void main(String[] args) {
        // Java selects the no-argument constructor first.
        ChainingTest test = new ChainingTest();

        /*
         * Execution order is:
         * 1. ChainingTest() starts and calls this(10).
         * 2. ChainingTest(int) starts and calls this("Aritra").
         * 3. ChainingTest(String) sets name to "Aritra" and returns.
         * 4. ChainingTest(int) sets roll to 10 and returns.
         * 5. ChainingTest() prints its message and returns.
         *
         * Therefore the messages appear in this order:
         * Name setting constructor
         * Roll setting constructor
         * Blank constructor
         */
        System.out.println(test.roll); // 10
        System.out.println(test.name); // Aritra
    }
}
