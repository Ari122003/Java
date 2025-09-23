package Interface.Default_Keyword;

interface Reptile extends LivingBeing{
    public void eat();
}

class Lizzard implements Reptile{
    @Override
    public void eat() {
        System.out.println("Lizzard eat");
    }
}

public class Way2 {
    public static void main(String[] args) {
        LivingBeing lizz = new Lizzard();
        lizz.eat();
    }
}
