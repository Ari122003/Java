package Interface;

interface Mother{

    public final String skin = "Dark";

}

interface Father{
    public final String height = "Tall";
}

class Child implements Mother,Father{
    public String name = "Johny";


}

public class Multiple_Inheritance {
    public static void main(String[] args) {
         Child child = new Child();

        System.out.println(child.name);
        System.out.println(child.skin);


        System.out.println(child.height);

    }
}
