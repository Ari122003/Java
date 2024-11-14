package OOPS;

class Account {

    private String password;

    // Setter

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter

    public void getPassword() {
        System.out.println(password);
    }
}

public class Getters_Setters {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("12345");
        account.getPassword();
    }
}
