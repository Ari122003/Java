package Enums;

enum Days4{
    MONDAY{
        @Override
        public void method(){
            System.out.println("Monday");
        }
    },
    TUESDAY{
        @Override
        public void method(){
            System.out.println("Tuesday");
        }
    };


    public abstract void method();
}

public class Abstract_Method {
    public static void main(String[] args) {
        Days4 days = Days4.TUESDAY;
        days.method();
    }
}
