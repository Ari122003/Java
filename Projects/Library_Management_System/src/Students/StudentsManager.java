package Students;

import java.util.ArrayList;
import java.util.List;

public class StudentsManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int rollNumber, String department){
        Student student = new Student(name, rollNumber, department);
        students.add(student);
    }
    public void showAllStudents() {
        System.out.println("Roll Number | Name        | Department");
        System.out.println("---------------------------------------");
        for (Student student : students) {
            System.out.printf("%11d | %-11s | %-10s\n",
                student.getRollNumber(),
                student.getName(),
                student.getDepartment());
        }
    }
}
