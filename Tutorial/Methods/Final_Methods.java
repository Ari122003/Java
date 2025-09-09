package Methods;


class Bird{
    public final void transportaion(){
        System.out.println("Flying bird");
    }
}

class Eagle extends Bird{
//    @Override

//    public final void transportaion(){...final methods cant be overriden
//
//    }
}


public class Final_Methods {

    public static void main(String[] args) {
        Bird b = new Eagle();

        b.transportaion();
    }
}
