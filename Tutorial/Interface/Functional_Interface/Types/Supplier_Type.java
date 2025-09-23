package Interface.Functional_Interface.Types;

@FunctionalInterface

interface Supplier<T>{
    T get(T value);
}

public class Supplier_Type {
    public static void main(String[] args) {
        Supplier<String> sup = (String s)->s.toUpperCase();
        System.out.print(sup.get("Hello"));
    }

}
