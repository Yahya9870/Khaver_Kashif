import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // U have to write a java code so that u can play ludo without dice.

        Random rd =new Random();
        int dice=rd.nextInt(6)+1;

        System.out.printf("Dice number is %d\n",dice);
    }
}
