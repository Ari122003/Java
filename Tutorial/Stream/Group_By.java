package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Group_By {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // IT Department - 5 employees
        employees.add(new Employee(1, "John Doe", "IT", 75000));
        employees.add(new Employee(2, "Jane Smith", "IT", 80000));
        employees.add(new Employee(3, "Bob Johnson", "IT", 72000));
        employees.add(new Employee(4, "Alice Williams", "IT", 85000));
        employees.add(new Employee(5, "Charlie Brown", "IT", 78000));

        // HR Department - 3 employees
        employees.add(new Employee(6, "David Miller", "HR", 60000));
        employees.add(new Employee(7, "Emma Davis", "HR", 65000));
        employees.add(new Employee(8, "Frank Wilson", "HR", 62000));

        // Finance Department - 4 employees
        employees.add(new Employee(9, "Grace Taylor", "Finance", 90000));
        employees.add(new Employee(10, "Henry Moore", "Finance", 95000));
        employees.add(new Employee(11, "Ivy Anderson", "Finance", 88000));
        employees.add(new Employee(12, "Jack Thomas", "Finance", 92000));

        // Marketing Department - 2 employees
        employees.add(new Employee(13, "Karen White", "Marketing", 70000));
        employees.add(new Employee(14, "Leo Harris", "Marketing", 68000));

        // Operations Department - 6 employees
        employees.add(new Employee(15, "Mia Martin", "Operations", 55000));
        employees.add(new Employee(16, "Noah Garcia", "Operations", 58000));
        employees.add(new Employee(17, "Olivia Martinez", "Operations", 60000));
        employees.add(new Employee(18, "Peter Robinson", "Operations", 57000));
        employees.add(new Employee(19, "Quinn Clark", "Operations", 59000));
        employees.add(new Employee(20, "Rachel Lewis", "Operations", 56000));

        Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                LinkedHashMap::new,
                Collectors.counting()));

        Map<String, Double> groupWiseHighestSalary = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                LinkedHashMap::new,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        emp -> emp.map(Employee::getSalary).orElse(0.0))));

        System.out.println(groupWiseHighestSalary);
    }
}

// Employee class
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
