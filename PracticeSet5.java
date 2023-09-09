import java.util.Scanner;
public class PracticeSet5 {
    /*Question 1 : Write a Java method to compute the average of three numbers.. */
    public static float Average(float a, float b, float c){
        return (a+b+c)/3;
    }

    /*Question 2 : Write a method named isEven that accepts an int argument. The method
    should return true if the argument is even, or false otherwise. Also write a program to test your
    method. */

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    /*Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
    palindrome, 321 is not)
    A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
    palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
    palindrome because the reverse of 321 is 123, which is not equal to 321.
    */

    public static boolean Palindrome(int num){
        int sum=0;
        int temp=num;
        while(num!=0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }

    /*Question 5 :
    Write a Java method to compute the sum of the digits in an integer. */

    public static int SumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        float a=sc.nextFloat();
        System.out.print("Enter the second number:- ");
        float b=sc.nextFloat();
        System.out.print("Enter the third number:- ");
        float c=sc.nextFloat();

        System.out.println("Average Of "+a+","+b+","+c+"is "+Average(a, b, c));
        System.out.print("Enter a number:- ");
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.print("Enter a number to check palindrome or not:- ");
        int p=sc.nextInt();
        if(Palindrome(p)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not A Palindrome Number");
        }
        System.out.print("Enter number to count sum of digits:- ");
        int dig=sc.nextInt();
        System.out.println("The Sum of "+dig+" Is:- "+SumOfDigits(dig));

        /*Question 4 : READ & CODE EXERCISE
        Search about(Google) & use the following methods of the Math class in Java:
        a. Math.min( )
        b. Math.max( )
        c. Math.sqrt( )
        d. Math.pow( )
        e. Math.avg( )
        f. Math.abs( ) */

        System.out.println(Math.min(10,20));
        System.out.println(Math.max(40,50));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.pow(10,10));
        //System.out.println(Math.avg(10,20));
        System.out.println(Math.abs(20));
    }
}
