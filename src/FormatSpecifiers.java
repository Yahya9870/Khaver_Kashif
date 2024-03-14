public class FormatSpecifiers {
    public static void main(String[] args) {

        int a=10,b=20;

        float f=3.2f;

        double d = 32.68;

        char c= 'A';

        String str="Khaver";


      //  System.out.printf("The value of a is %d, b is %d, f is %f, d is %f c is %c and str is %s",a,b,f,d,c,str);
        System.out.format("The value of a is %d, b is %d, f is %.2f, d is %.2f c is %c and str is %s",a,b,f,d,c,str);
    }
}
