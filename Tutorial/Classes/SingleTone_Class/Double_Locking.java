package Classes.SingleTone_Class;
class DBConnection3{

    private static volatile DBConnection3 connObj;

    public static DBConnection3 getInstance(){
        if(connObj == null){
            synchronized (DBConnection3.class){
                if(connObj == null){
                    connObj = new DBConnection3();
                }
            }
        }
        return connObj;
    }
}
public class Double_Locking {
}
