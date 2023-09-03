import java.util.Scanner;

public class JavaTypeConversion {
    public static void main(String[] args) {
        //long a=100;
        //int b=a;//Type ERROR
        int a=100;
        long b=a;//Compiled Successfully
        System.out.println(b);
        Scanner sc=new Scanner(System.in);
        //int c=sc.nextFloat();/*Type Error */
        float c=sc.nextInt();
        System.out.println(c);



        /*Explicit type casting */

        float d=sc.nextFloat();
        int e=(int)d;

        System.out.println(e);

        /*Ascii Find */

        char ch='g';
        int num=ch;
        System.out.println(num);
    }    
}
