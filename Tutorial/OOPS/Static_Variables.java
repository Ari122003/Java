

class Student{
    String name;
    int roll;
    static String school = "BECMS";

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
}

public class Static_Variables {
    public static void main(String[] args) {
        Student s1 = new Student("James",22);
        Student s2 = new Student("John",23);

        Student.school = "TINT";
        System.out.println(Student.school);
    }
}
