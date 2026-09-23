package OOPS.Static_Keyword;

class Student {
    // These are instance variables. Every Student object gets its own copy.
    // Therefore, s1.name can be different from s2.name.
    String name;
    int roll;

    // static makes school a class variable instead of an object variable.
    // Java creates one shared copy for the Student class, not one copy per
    // Student object. All Student objects use the same school value.
    static String school = "BECMS";

    Student(String name, int roll) {
        // this.name and this.roll refer to the current object's fields.
        this.name = name;
        this.roll = roll;
    }
}

public class Static_Variables {

    // This static variable belongs to Static_Variables itself.
    // It can be used from static main(...) without creating a
    // Static_Variables object because both members belong to the class.
    static String hello = "hello";

    public static void main(String[] args) {
        // Each new Student gets separate name and roll values.
        Student s1 = new Student("James", 22);
        Student s2 = new Student("John", 23);

        // hello is accessed directly because main and hello belong to the
        // same class and are both static.
        System.out.println(hello);

        // A static variable should usually be accessed through its class
        // name. This changes the one shared school value for every Student,
        // including both s1 and s2; it does not create a new school value.
        Student.school = "TINT";
        System.out.println(Student.school);
    }
}
