package OOPS;

interface Wave{
    void nature();
}

interface Particle{
    void prop();
}

class Light implements Wave,Particle{
    public void nature(){
        System.out.println("Light has wave nature");
    }
    public void prop(){
        System.out.println("Light has wave prop");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {

    }
}
