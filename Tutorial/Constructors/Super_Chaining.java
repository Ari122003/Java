package Constructors;

class Employee{
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

class Backend_Dev extends Employee{
    int projectId;
    String projectName;
    public Backend_Dev(int projectId, String projectName,int empId , String empName) {
      super(empId, empName);
      this.projectId = projectId;
      this.projectName = projectName;
    }
}

public class Super_Chaining {
    public static void main(String[] args) {
        Backend_Dev bd = new Backend_Dev(5,"Banking",134,"Aritra");

        System.out.println(bd.empId);
        System.out.println(bd.empName);



    }
}
