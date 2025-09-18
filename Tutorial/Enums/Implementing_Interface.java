package Enums;

interface MyInterface {
    public String toLowerCase();
}
enum Days5 implements MyInterface {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
public class Implementing_Interface {

    public static void main(String[] args) {
        Days5 day = Days5.MONDAY;
        System.out.println(day.toLowerCase());
    }
}
