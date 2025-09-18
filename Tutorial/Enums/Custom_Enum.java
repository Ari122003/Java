package Enums;

enum CustomDays{
        MONDAY(201,"First day of week"),
    TUESDAY(202,"Second day of week"),
    WEDNESDAY(203,"Third day of week"),
    THURSDAY(204,"Fourth day of week"),
    FRIDAY(205,"Fifth day of week"),
    SATURDAY(206,"Sixth day of week"),
    SUNDAY(207,"Sun day of week");

    private int val;
    private String comment;

    CustomDays(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }
    public String getComment() {
        return comment;
    }

    public static CustomDays getCustomeDay(int val)
    {
        for(CustomDays c : CustomDays.values()){
            if(c.val == val){
                return c;
            }
        }
        return null;
    }

}

public class Custom_Enum {
    public static void main(String[] args) {
        CustomDays day = CustomDays.getCustomeDay(205);
        System.out.println(day.getComment());
    }
}
