package OOPS;

class Student {
    String name;
    int roll;
    static String school = "BECMS";

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class Static_Variables {

    static String hello = "hello";

    public static void main(String[] args) {
        Student s1 = new Student("James", 22);
        Student s2 = new Student("John", 23);

        System.out.println(hello);

        Student.school = "TINT";
        System.out.println(Student.school);
    }
}
