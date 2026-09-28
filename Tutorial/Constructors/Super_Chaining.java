package Constructors;

// Constructor chaining means: when a subclass object is created,
// Java first calls the superclass constructor before executing the subclass constructor.
// This ensures the inherited fields are initialized properly.

class Employee {
    int empId;
    String empName;

    // This is the superclass constructor.
    // It initializes the properties that belong to the Employee class.
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

// Backend_Dev inherits from Employee.
// So it gets empId and empName as inherited members.
class Backend_Dev extends Employee {
    int projectId;
    String projectName;

    // This is the subclass constructor.
    // The first statement inside a constructor of a child class must be super(...)
    // if we want to call the parent constructor.
    public Backend_Dev(int projectId, String projectName, int empId, String empName) {
        // super(empId, empName) calls Employee(int, String)
        // before the subclass initializes its own fields.
        super(empId, empName);

        // After parent initialization, subclass-specific fields are assigned.
        this.projectId = projectId;
        this.projectName = projectName;
    }
}

public class Super_Chaining {
    public static void main(String[] args) {
        // Creating an object of Backend_Dev.
        // Java internally does this:
        // 1. Call Employee(int, String) via super(empId, empName)
        // 2. Initialize Backend_Dev projectId and projectName
        Backend_Dev bd = new Backend_Dev(5, "Banking", 134, "Aritra");

        // Now both inherited and subclass properties are available.
        System.out.println(bd.empId); // 134
        System.out.println(bd.empName); // Aritra

        // Output shows that Employee data is initialized through the parent
        // constructor,
        // while Backend_Dev data is initialized in the child constructor.
    }
}
