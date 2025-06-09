
enum Status{
    Success,Failed,Pending
}


public class Enums {
    public static void main(String[] args) {
        Status s = Status.Pending;

        System.out.println(s);

        Status []ss = Status.values();


        for(Status status:ss){
            System.out.println(status);
        }



    }
}
