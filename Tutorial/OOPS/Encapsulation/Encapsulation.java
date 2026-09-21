package OOPS.Encapsulation;

/*
 * Encapsulation is the OOP principle of bundling an object's data and the
 * methods that operate on that data inside one class, while hiding the data's
 * direct implementation from outside code.
 *
 * In Java, this is commonly achieved by:
 * - declaring fields private, and
 * - exposing controlled public methods (getters and setters).
 *
 * This protects an object's valid state. For example, a bank balance must not
 * become negative because another class assigned an invalid value directly.
 */
class BankAccount {
    // Private fields cannot be accessed directly outside BankAccount.
    private String accountHolder;
    private double balance;

    // A constructor establishes a valid starting state for every new account.
    public BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;

        // Validation belongs with the data it protects.
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.balance = openingBalance;
    }

    // A getter provides read-only access to the private account holder field.
    public String getAccountHolder() {
        return accountHolder;
    }

    // A getter lets callers read the balance without allowing direct changes.
    public double getBalance() {
        return balance;
    }

    // This method is safer than a public balance field: it permits only valid
    // deposits and keeps the update logic in one place.
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // A controlled operation can enforce business rules before changing data.
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aritra", 1_000);

        // account.balance = -500; // Not allowed: balance is private.
        // Instead, callers use the public, validated operations below.
        account.deposit(500);
        boolean withdrawn = account.withdraw(300);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Withdrawal successful: " + withdrawn);
        System.out.println("Current balance: " + account.getBalance());
    }
}
