package Exception_Handling;

public class Throws {
    static void func() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
    public static void main(String[] args) {
        try{
            func();
        }
        catch(ClassNotFoundException e){
           e.printStackTrace();
        }
    }
}
