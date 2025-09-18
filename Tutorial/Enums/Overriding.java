package Enums;

enum Days3{
    MONDAY {
        @Override
        public void method() {
            System.out.println("This is Monday method");
        }
    }, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public void method(){
        System.out.print("This is default method");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Days3 day = Days3.MONDAY;
        day.method();

        Days3 day2 = Days3.TUESDAY;
        day2.method();
    }
}
