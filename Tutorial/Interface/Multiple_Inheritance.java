package Interface;

interface Living_Being{
    int x = 10;
    public void breathe();
}

interface Mamal{
    public void breathe();
}

interface Doggy{
    public void breathe();
}

class Lab implements Living_Being,Mamal,Doggy{
    @Override
    public void breathe() {
        System.out.println("Lab breaths");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println(Lab.x);
        //Lab.x = 12; not possible because implicitly x is final nad static
    }
}
