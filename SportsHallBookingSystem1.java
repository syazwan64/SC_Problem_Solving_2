import java.util.Scanner;

public class SportsHallBookingSystem1 {
    public void registerAccount() {
        // Pre-condition: The system is connected to a database.
        System.out.println("Welcome to UTM Sports Hall Booking System!");
        System.out.println("Please enter credentials below to register.");

        // Step 1: Customer fills in the name, email, and password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Step 2: Customer clicks the "Sign Up" button after completing the registration form
        System.out.println("Processing...");

        // Step 3: Check if any field is left blank
        assert !name.trim().isEmpty() && !email.trim().isEmpty() && !password.trim().isEmpty() :
                "One or more fields are left blank. Please fill in all fields.";

        // Step 4: End of the use case
        System.out.println("Successfully registered!");

        // Post-condition: The customer successfully creates an account for the Sports Hall Booking System
        System.out.println("Thank you for registering!");
    }

    public static void main(String[] args) {
        SportsHallBookingSystem1 system = new SportsHallBookingSystem1();
        system.registerAccount();
    }
}