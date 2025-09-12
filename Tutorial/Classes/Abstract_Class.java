package Classes;


abstract class MusicInstrument{

    public abstract void play();
}

class Guitar extends MusicInstrument{
    @Override
    public void play() {
        System.out.println("Guitar");
    }
}


public class Abstract_Class {

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
    }
}
