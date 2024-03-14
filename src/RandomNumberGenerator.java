import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object

        Random rd = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rd.nextInt(100)+1;

        // Print the generated random number
        System.out.println("Random number generated is "+randomNumber);
    }
}
