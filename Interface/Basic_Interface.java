
package Interface;

interface Employee{

    public final String Company="TCS";

    public static boolean  working = true;

}

 class DevOps implements Employee{
    String name;
    int salary;

    public DevOps(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }
    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);

    }
}





public class Basic_Interface{
    public static void main (String[] args){
        DevOps d = new DevOps("Aritra", 100000);
        d.getInfo();
        System.out.println("Company: "+d.Company);
        System.out.println("Working: "+Employee.working);
    }
}