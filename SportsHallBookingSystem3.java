import java.util.Scanner;

public class SportsHallBookingSystem3 {
    private boolean isUserRegistered = false;
    private boolean isUserLoggedIn = false;

    public void bookCourt() {
        // Pre-conditions:
        // 1. User has registered their graduate account
        // 2. User has logged in with their graduate account
        assert isUserRegistered : "Pre-condition 1 failed: User has not registered their graduate account.";
        assert isUserLoggedIn : "Pre-condition 2 failed: User is not logged in with their graduate account.";

        // Step 1: Customer clicks on the make a booking button
        System.out.println("Step 1: Customer clicks on the make a booking button");

        // Step 2: System displays the layout of courts
        System.out.println("Step 2: System displays the layout of courts");

        // Step 3: Customer selects the preferred court
        System.out.println("Step 3: Please select the preferred court:");
        Scanner scanner = new Scanner(System.in);
        String selectedCourt = scanner.nextLine().trim();
        assert !selectedCourt.isEmpty() : "Court selection cannot be empty.";

        // Step 4: Customer chooses booking date and time
        System.out.println("Step 4: Please enter booking date and time:");
        String bookingDateTime = scanner.nextLine().trim();
        assert !bookingDateTime.isEmpty() : "Booking date and time cannot be empty.";

        // Step 5: Customer selects the number of players in the booking
        System.out.println("Step 5: Please enter the number of players:");
        String playersInput = scanner.nextLine().trim();
        assert !playersInput.isEmpty() && playersInput.matches("\\d+") : "Number of players must be a non-empty integer value.";
        int numberOfPlayers = Integer.parseInt(playersInput);

        // Step 6: Customer clicks on the confirm booking button
        System.out.println("Step 6: Customer clicks on the confirm booking button");

        // Step 7: System displays successfully booked and displays the booking detail
        System.out.println("Step 7: System displays successfully booked and displays the booking detail");

        // Post-condition: User successfully booked a court
        System.out.println("Post-condition: User successfully booked a court");
    }

    public static void main(String[] args) {
        SportsHallBookingSystem3 system = new SportsHallBookingSystem3();
        system.isUserRegistered = true; // Simulate user registration
        system.isUserLoggedIn = true; // Simulate user login
        system.bookCourt();
    }
}
