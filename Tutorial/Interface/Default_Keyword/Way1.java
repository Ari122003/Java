package Interface.Default_Keyword;

interface LivingBeing{
    default void eat(){
        System.out.println("eat");
    }
}

interface Mamal extends LivingBeing{

}

class Lion implements Mamal{}

public class Way1 {
    public static void main(String[] args) {
        LivingBeing lion = new Lion();

        lion.eat();
    }
}
