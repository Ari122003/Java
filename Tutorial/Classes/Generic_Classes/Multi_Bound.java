package Classes.Generic_Classes;

 class Parent{

}

 interface A{

}

interface B{

}

class C extends Parent implements A,B {}

class Print3<T extends Parent & A & B>{
    T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

public class Multi_Bound {
     public static void main(String[] args) {
         Print3<C> p = new Print3<>();
     }
}
