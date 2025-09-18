package Enums;

 enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Basic_Enum {
     public static void main(String[] args) {

         for(Days day : Days.values()){
             System.out.println(day.ordinal());
         }

         Days day = Days.valueOf("WEDNESDAY");
         System.out.println(day.name());
     }
}
