
package Interface;

interface Employee {

    public final String Company = "TCS";

    public static boolean working = true;

    abstract public void greet();

}

class DevOps implements Employee {
    String name;
    final int salary;

    public DevOps(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

    public void greet() {
        System.out.println("Hello, " + name + "! Welcome to " + Company + ".");
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

    }
}

public class Basic_Interface {
    public static void main(String[] args) {
        DevOps d = new DevOps("Aritra", 100000);
        d.greet();
        d.getInfo();
        System.out.println("Company: " + d.Company);
        System.out.println("Working: " + Employee.working);
    }
}