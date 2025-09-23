package Interface.Default_Keyword;

interface Bird{

    public int minimumFlyHeight();

    default boolean canFly(){
        return true;
    }
}

class Eagle implements Bird{
    @Override
    public int minimumFlyHeight() {
        return 500;
    }
}
class Crow implements Bird{
    @Override
    public int minimumFlyHeight() {
        return 100;
    }
}

public class Default_Method {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird crow = new Crow();
        System.out.println(eagle.canFly());
    }
}
