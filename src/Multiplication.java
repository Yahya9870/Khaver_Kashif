import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int i=1;
        System.out.println("Enter the limit up to which you want the table: ");
        int limit = sc.nextInt();
        while (i<=limit){

            System.out.printf("%d X %d = %d\n",num,i,(num*i));

            i++;

        }

    }
}

// %d %f %c and %s are the format specifiers in Java for integers, float/double, characters and strings respectively.
