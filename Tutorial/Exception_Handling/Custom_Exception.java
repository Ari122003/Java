package Exception_Handling;


class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

public class Custom_Exception {
    public static void func() throws MyException {
        throw new MyException("Custom Exception");
    }
    public static void main(String[] args) {
        try{
            func();
        }
        catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
