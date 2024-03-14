import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number that you want to be checked as prime: ");
        long num= sc.nextLong();
        // PrimeNumber--> a number which divisible by only 1 and the number itself. mins only two factors are possible.
        // For example: if n is the prime number then only it has 2 factors i.e. n and 1.
        // For instance 13 it has only 2 factors 1 and 13.
        long count=0;
        //  num=18000
        // your for loop will run from 1 to 13 thats the value of i also.
        for (long i = 2; i <num ; i++) {

            if(num%i==0){
                count++;
                break;
            }

        }

        if(count==1){

            System.out.println("Not Prime");
        }

        else {
            System.out.println(" Prime");
        }

    }
}
