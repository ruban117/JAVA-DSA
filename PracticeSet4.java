import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        /* Question 1 : How many times 'Hello' is printed?*/
        for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i+=2;
        }

        /*Question 2 : Write a program that reads a set of integers, and then prints the sum of the
        even and odd integers.
        */

        Scanner sc=new Scanner(System.in);
        int oddsum=0;
        int evensum=0;
        int flag=0;
        do{
            System.out.print("Enter any number:- ");
            int inp=sc.nextInt();
            if(inp%2==0){
                evensum+=inp;
            }
            else{
                oddsum+=inp;
            }
            System.out.print("Do you want to continue(Y/N):- ");
            char s=sc.next().charAt(0);
            if(s=='N'|| s=='n'){
                flag=1;
            }
        }while(flag!=1);
        System.out.println("Sum of odd numbers:- "+oddsum);
        System.out.println("Sum of even numbers:- "+evensum);


        /*Question 3 : Write a program to find the factorial of any number entered by the user. */
        System.out.print("Enter Any Number:- ");
        int facto=sc.nextInt();
        int f=1;
        for(int i=1;i<=facto;i++){
            f*=i;
        }
        System.out.println("Factorial Of "+facto+" is:- "+f);

        /*Question 4 : Write a program to print the multiplication table of a number N, entered by the
        user */

        System.out.print("Enter the number which you want to create a mul table:- ");
        int mul=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(mul+" * "+i+" = "+(mul*i));
        }
    }
}
