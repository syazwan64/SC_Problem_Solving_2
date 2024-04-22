import java.util.Scanner;

public class SportsHallBookingSystem2 {
    private boolean isUserRegistered = false; // Flag to simulate user registration

    public void login() {
        // Pre-conditions:
        // 1. The system is connected to a database.
        // 2. User has registered an account.
        assert isDatabaseConnected() : "Pre-condition 1 failed: Database is not connected.";
        assert isUserRegistered : "Pre-condition 2 failed: User has not registered an account.";

        // Step 1: Display sign up / login page
        System.out.println("Step 1: Display sign up / login page");

        // Step 2: User login
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to login?");
        System.out.println("1. Login with email and password");
        System.out.println("2. Login via Google account");
        System.out.println("3. Forgot password");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                loginWithEmailAndPassword(scanner);
                break;
            case 2:
                loginWithGoogle();
                break;
            case 3:
                forgotPassword();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Post-condition: The users successfully login to the Sports Hall Booking System.
        System.out.println("Post-condition: The users successfully login to the Sports Hall Booking System. User redirected to homepage.");
    }

    private boolean isDatabaseConnected() {
        // Simulated method to check if the system is connected to a database
        return true;
    }

    private void loginWithEmailAndPassword(Scanner scanner) {
        // Step 2.1: User fills in the email
        System.out.print("Enter your email: ");
        scanner.nextLine(); // Consume the newline character left by previous nextInt()
        String email = scanner.nextLine().trim(); // Read entire line

        // Step 2.2: User fills in the password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine().trim(); // Read entire line

        // Step 2.3: User clicks the "Sign In" button after completing the login form
        System.out.println("Processing...");

        // Step 2.4: Check if both fields are non-empty
        assert !email.trim().isEmpty() && !password.trim().isEmpty() : "One or more fields are left blank. Please fill in all fields.";
    }

    private void loginWithGoogle() {
        // Step 3.1: User selects Log In with Google icon
        System.out.println("Step 3.1: User selects Log In with Google icon");

        // Step 3.2: The system proceeds to authentication provided by Google API
        System.out.println("Step 3.2: The system proceeds to authentication provided by Google API");
    }

    private void forgotPassword() {
        // Step 4: User forgot password
        System.out.println("Step 4: User forgot password");
        // Implementation for handling forgotten password
    }

    public static void main(String[] args) {
        SportsHallBookingSystem2 system = new SportsHallBookingSystem2();
        system.isUserRegistered = true; // Simulate user registration
        system.login();
    }
}