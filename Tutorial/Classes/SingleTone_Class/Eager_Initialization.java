package Classes.SingleTone_Class;

class DBConnection {
    private static DBConnection connObj = new DBConnection();



    public static DBConnection getInstance() {
        return connObj;
    }
}

public class Eager_Initialization {
    public static void main(String[] args) {
        DBConnection conn = DBConnection.getInstance();
    }
}

