package OOPS;

class Student {
    String name;
    int roll;
    static String college = "TINT";
    private static int count = 0;
    int id;

    public Student(String n, int r) {
        name = n;
        roll = r;
        count++;
    }

    public static void getCount() {
        System.out.println("Student count: " + count);
    }

}

public class Static_Variable {

    public static void main(String[] args) {

        Student s1 = new Student("Aritraa", 81);
        Student s2 = new Student("Mike", 39);
        Student s3 = new Student("Jason", 103);

        System.out.println(s1.name + " " + s1.roll);
        System.out.println(s2.name + " " + s2.roll);
        System.out.println(s3.name + " " + s3.roll);

        Student.getCount();

    }

}
