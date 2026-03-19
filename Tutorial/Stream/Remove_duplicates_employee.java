package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Remove_duplicates_employee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John Doe", "john.doe@company.com", 50000));
        employees.add(new Employee(2, "Jane Smith", "jane.smith@company.com", 60000));
        employees.add(new Employee(3, "Bob Johnson", "john.doe@company.com", 55000)); // Duplicate email
        employees.add(new Employee(4, "Alice Williams", "alice.williams@company.com", 65000));
        employees.add(new Employee(5, "Charlie Brown", "charlie.brown@company.com", 52000));
        employees.add(new Employee(6, "David Miller", "jane.smith@company.com", 58000)); // Duplicate email
        employees.add(new Employee(7, "Emma Davis", "emma.davis@company.com", 70000));
        employees.add(new Employee(8, "Frank Wilson", "charlie.brown@company.com", 53000)); // Duplicate email
        employees.add(new Employee(9, "Grace Taylor", "grace.taylor@company.com", 62000));
        employees.add(new Employee(10, "Henry Moore", "john.doe@company.com", 51000)); // Duplicate email

        List<Employee> withoutDuplicate = employees.stream()
                .collect(Collectors.toMap(employee -> employee.getEmail(), Function.identity(),
                        (existing, replacement) -> existing))
                .values().stream().sorted(Comparator.comparingInt(Employee::getId)).toList();

        System.out.println(withoutDuplicate);

    }
}

// Employee class
class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
