import java.util.Scanner;

public class PasswordAuthentication {
    public static void main(String[] args) {
        // Hardcoded correct password for simplicity
       // String correctPassword = "password123";
        int correctPassword=12345;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store user input and authentication result
        int userInput;
        boolean isAuthenticated = false;

        // Loop until the user enters the correct password
        do {
            // Prompt the user to enter the password
            System.out.print("Enter your password: ");
            userInput = scanner.nextInt();

            // Check if the entered password matches the correct password
            if (userInput==correctPassword) {
                System.out.println("Authentication successful!");
                isAuthenticated = true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (isAuthenticated==false);

        // Close the scanner
        scanner.close();  // but good programming practice.
    }
}
