public class Arrays {
    public static void main(String[] a) {
        //Array --> A data structure or contiguous blocks of memory containing similar data type.
        // Write a java program that stores GPA of 100 students.
       
        // CASE A: we wake 100 variables of double data type and store the values.
        double student1GPA = 3.5;
        double student2GPA = 3.6;
        double student3GPA = 3.1;
        double student4GPA = 3.4;  // ........ 100th student.


        // CASE create a single structure that stores all of the values in an ordered manner just like a container with different slots.
        // This scenario is better than CASE A and this is an Array.

        // Syntax of Array:
        // dataType [] nameOfArray = new dataType[size in int];
//         int [] marks=new int[5]; // we have declared an array named marks with size 5 and integer data type.

//        marks[0]=50;
//        marks[1]=65;
//        marks[2]=73;
//        marks[3]=88;
//        marks[4]=100;
//        marks[4]=99;
        //marks[5]=500; gives error/exception at run-time out of bounds
        int  marks[]={10,20,30,40,50,60}; // here we need not declare size as it will be detected automatically.

        //System.out.println(marks[5]);
        System.out.println("The length of the array is: "+marks.length);

        // Displaying of Array:
        System.out.println("Here is our complete array display:");
        // 1. With For-Loop

//        for (int index = 0; index < marks.length ; index++) {
//            System.out.print(marks[index]+" ");
//
//        }

        //2. With while loop

//        int index=0;
//
//        while(index<marks.length){
//
//            System.out.println(marks[index]);
//
//            index++;
//        }


        //3. For-each loop or enhanced for loop especially to display array quickly.

        for(int elements:marks){

            System.out.print(elements+" ");
        }

        // Array of String
        System.out.println(); // line changer
        String arr []={"Kashif", "Khaver", "Ali", "Hussain", "Hasan"};

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+", ");

        }
        System.out.println();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char items : vowels){
            System.out.println(items);
        }




    }
}
