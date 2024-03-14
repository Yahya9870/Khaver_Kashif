import java.util.Scanner; // Step 1

public class UserIInputJava {
    public static void main(String[] args) {

       Integer num1=8;
       Double d=8.3;
        System.out.println(num1);

        //int userDefined=10;

        //Step 2: Creating an object from the Scanner class.

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Hello, Mr. User pls enter a number: ");
//        int userInput=sc.nextInt(); // We have taken the input from the user thru keyboard.

        // if u divide any number in the world by 2 then only two possibilities can be there:
        //1. 0 remainder  divides completely by 2  for example 4,6,100,500  EVEN
        //2. 1 remainder  does not divide completely by 2     7,15,23,25    ODD

        int n=11;

        if(n%2==0){

            System.out.println("EVEN NUMBER:");
        }

        else {

            System.out.println("ODD NUMBER");
        }


       // sc.close(); // Not mandatory but a good programming practice.


    }
}
