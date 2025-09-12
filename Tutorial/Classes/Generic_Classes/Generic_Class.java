package Classes.Generic_Classes;

class Print<T>{
    T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

class ColourPrint extends Print<String>{

}
class ColourPrint2<T> extends Print<String>{

}

public class Generic_Class {

    public static void main(String []args){
         Print<String> p = new Print<>();
         p.set("Hello");
         System.out.println(p.get());


         ColourPrint cp = new ColourPrint();

         ColourPrint2<String> cp2 = new ColourPrint2<>();

    }
}
