package Interface.Functional_Interface.Types;

@FunctionalInterface
interface Consumer<T>{
    void accept(T value);
}

public class Consumer_Type {
    public static void main(String[] args) {
        Consumer<String> c = (String s) ->{
            System.out.println(s);
        };
        c.accept("Hello");
    }
}
