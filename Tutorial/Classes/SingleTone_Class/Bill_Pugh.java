package Classes.SingleTone_Class;

class DBConnection4 {
    private static class Helper{
        private static DBConnection4 obj = new DBConnection4();
    }

    public static DBConnection4 getInstance(){
        return Helper.obj;
    }
}

public class Bill_Pugh {
}
