import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // WAP to calculate sum of digits of a number given by the user.
        // Sample Input: 1234
        // Sample Output: 10
        // Explanation: 1+2+3+4==10
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num= sc.nextInt();
        int sum=0;
        int r; // remainder
        // num=1    2     3        4
        while(num!=0){  //1. true 2. true 3. true 4. true 5. false

            r=num%10;   //1.4 2.3 3. 2 4. 1
            sum=sum+r;  //1.4 2.4+3=7 3. 9 4. 10
            num=num/10; //1.123 2. 12 3. 1 4. 0

        }

        System.out.printf("The sum of digits of the number given by user is %d",sum);
    }
}
// Palindrome
// num =111
// rev(111)=111