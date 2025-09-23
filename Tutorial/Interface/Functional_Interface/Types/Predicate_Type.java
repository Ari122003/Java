package Interface.Functional_Interface.Types;

@FunctionalInterface
interface  Predicate<T>{
    public boolean test(T t);
}

public class Predicate_Type {
    public static void main(String[] args) {
        Predicate<Integer> p = (Integer i) -> i % 2 == 0;
        System.out.println(p.test(44));
    }
}
