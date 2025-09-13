package Classes.Generic_Classes;

class Print2<T extends Number>{
    T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

public class Upper_Bound {
    public static void main(String[] args) {
        Print2<Float> obj = new Print2<>();

        obj.set(45.76f);

        System.out.println(obj.get());
    }
}
