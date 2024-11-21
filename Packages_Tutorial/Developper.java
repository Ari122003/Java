package Packages_Tutorial;

import Packages_Tutorial.Employee;


public class Developper extends Employee {

    String type;

    public Developper(String name,String email,int salary,String type) {
        super(name,email,salary);
        this.type = type;

    }



    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
        System.out.println("Type: " + type);
    }

}
