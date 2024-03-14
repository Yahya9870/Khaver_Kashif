import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        // WAP to get number digits in  a number given by user
        // input is 12345
        // output: 5
        // if you perform %10 with any integer then it will give you last digit of that number.
        // For example 1234%10 == 4
        // if you perform /10 operation with any integer then it will eliminate its last digit.
        // For example 1234/10==123
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num= sc.nextInt();
        int count=0;
        // 56/10=5      .6
        // num=  1     2   3      4
        while(num!=0){ // 1.true 2. true  3. true 4. true 5. false and loop terminates.
            num=num/10;  // 1. num=123  2. 12 3. 1  4. 0
            count=count+1; // or count++ 1. 1 2. 2 3. 3 4. 4

        }

        System.out.printf("Given number by the user has %d digits.",count);
    }
}
