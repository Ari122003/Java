package OOPS;

class Customer {
    public String name;
    public final String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public final void kyc() {
        System.out.println("Customer has completed KYC process.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}

class LoanCustomer extends Customer {
    int loanAmmount;

    public LoanCustomer(String name, String id, int loanAmmount) {
        super(name, id);
        this.loanAmmount = loanAmmount;
    }

    public void display() {
        super.display();
        System.out.println("Loan Ammount: " + loanAmmount);
    }

    // public void kyc(){................not possible

    // }
}

public class Final {

    public static void main(String[] args) {
        Customer customer = new LoanCustomer("John Doe", "C12345", 200000);

        customer.display();

    }

}
