import java.util.Random;
import java.util.Scanner;

public class testing1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        boolean isFound = false;

        // Create a Random object

        Random rd = new Random();
        System.out.println("Please enter a number");

        // Generate a random number between 1 and 100
        int randomNumber = rd.nextInt(100) + 1;
        int userInput;
        while (!isFound) {

             userInput = scanner.nextInt();

            if (randomNumber == userInput) {

                isFound = true;

                System.out.println("you have entered the correct number ");

            } else if (userInput>randomNumber) {

                System.out.println("please enter a lower number");

            } else {

                System.out.println("please enter a higher number ");

            } //else

            // Print the generated random number
            // System.out.println("Random number generated is "+randomNumber);
        }


    }
}

// develp a java program, guess the number in wbhcih user has to enter a number, then a message will be displayed, asking the user to display a higher or lower number
//if the random number generated is matches then say success.