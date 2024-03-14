import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // WAP to generate reverse of a number provided by the user.
        // Example 1234 will give 4321.
        // Note: We dont have to print in a reverse order.

        // Wrong Method.

//        int num=1234;
//
//        while(num!=0){
//
//            System.out.print(num%10);
//            num=num/10;
//        }

        // Correct Method is to generate a reverse number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num= sc.nextInt();
        int OriginalNumber=num; // we have saved the value given by the user.
        int rev=0;
        int r; // remainder.
        // 123     4

        while(num!=0){

            r=num%10;  // 1.4 2. 3 3. 2 4. 1


            rev=rev*10+r; // 1.4 2. 4X10+3=43 3. 43X10+2=430+2=432 4 432X10+1= 4320+1=4321


            num=num/10;// 1. 123 2. 12 3. 1 4. 0
        }

        System.out.printf("The reverse of %d is %d",OriginalNumber,rev);
    }
}
