package Interface.Functional_Interface.Types;

@FunctionalInterface

interface Function<T,V>{
    public T apply(V value);
}

public class Function_Type {
    public static void main(String[] args) {
        Function<Integer,String> objRef = (String s)-> s.length();

        System.out.print(objRef.apply("Aritra"));


    }
}
