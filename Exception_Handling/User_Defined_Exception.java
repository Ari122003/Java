package Exception_Handling;

// User-defined exception
class InvalidAgeException extends Exception {
    // Constructor to pass a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class User_Defined_Exception {

    public static void main(String[] args) {
        int age = 21;

        try {
            if (age < 18) {
                // Throwing a user-defined exception
                throw new InvalidAgeException("Age must be 18 or above to register.");
            } else {
                System.out.println("Age is valid. You can register.");
            }
        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
