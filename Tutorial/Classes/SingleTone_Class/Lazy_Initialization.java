package Classes.SingleTone_Class;

class DBConnection1{
    private static DBConnection1 obj;

    public static DBConnection1 getInstance(){
        if(obj == null){
            obj = new DBConnection1();
        }
        return obj;
    }
}

public class Lazy_Initialization {
}
