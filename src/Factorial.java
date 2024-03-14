import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number to get the factorial");

        int userInput = sc.nextInt();

        int fact = 1;

        // user entered 5

        for (int i = userInput; i >=1; i--){   // 1. i=5  2. i=4 3. i=3 4. i=2 5. i=1 6. i=0

            fact = fact * i;                  // 1. fact=5  2. fact=5X4=20 3. fact=5X4X3=60 4. 5X4X3X2=120 5. fact=5X4X3X2X1=120

        }

        System.out.println("The factorial of the given number is " +fact);

    }
}