package Exception_Handling;

public class Handling {
    static void func(int a) throws ClassNotFoundException , InterruptedException{
        if(a > 5){
            throw new ClassNotFoundException();
        }
        throw new InterruptedException();
    }
    public static void main(String[] args) {

        try{
            func(4);
        }
        catch(Exception e){
            e.printStackTrace();
        }
//        catch(ClassNotFoundException cfe){
//            cfe.printStackTrace();
//        }
//        catch(InterruptedException ie){
//            ie.printStackTrace();
//        }
        finally{
            System.out.println("finally");
        }

    }

}
