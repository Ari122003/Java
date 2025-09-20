package Classes.SingleTone_Class;

class DBConnection2{

    private static DBConnection2 instance;

    synchronized static DBConnection2 getInstance(){
        if(instance == null){
            instance = new DBConnection2();
        }
        return instance;
    }

}

public class Synchronized_Initialization {
}
