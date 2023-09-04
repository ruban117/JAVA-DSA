/*Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
 */

import java.util.Scanner;
public class PracticeSet1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int a=sc.nextInt();
        System.out.print("Enter the second number:- ");
        int b=sc.nextInt();
        System.out.print("Enter the third number:- ");
        int c=sc.nextInt();

        System.out.println("The Average is:- "+(a+b+c)/3);

        /*Question 2: In a program, input the side of a square. You have to output the area of the
        square.
        (Hint : area of a square is (side x side)) */
        System.out.println("Enter Side:- ");
        int side=sc.nextInt();
        System.out.println("Area of square is:- "+(side*side));

        /*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

        System.out.println("Enter The Price Of Pencil:- ");
        float pencil=sc.nextFloat();
        System.out.println("Enter the price of pen:- ");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of eraser:- ");
        float eraser=sc.nextFloat();
        System.out.println("Total Is:- "+(pencil+pen+eraser));
        System.out.println("With GST:- "+((pencil+pen+eraser)*0.18));



        /*:Question 4: What will be the type of result in the following Java code? */

        byte d=4;
        char e='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double g=99.9954;
        System.out.println((f*d)+(i%e)-(g*s));//double

        /*Question 5: (Advanced) Will the following statement give any error in Java?*/

        int $ = 24;
        System.out.println($);//no error
    }
}


