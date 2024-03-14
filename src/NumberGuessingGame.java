import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean correctGuess = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Try higher!");
            } else if (guess > randomNumber) {
                System.out.println("Try lower!");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                correctGuess = true;
            }
        }

        scanner.close();       // just good programming practices
        System.exit(0); // Terminate the program with exit code 0
    }
}
