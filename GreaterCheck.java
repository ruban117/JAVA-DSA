import java.util.Scanner;
public class GreaterCheck {
   public static void main(String[] args) {
        System.out.println("Enter the first number:- ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the Second number:- ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("The Largest Number Is:- "+a);
        }
        else{
            System.out.println("The Largest Number Is:- "+b);
        }
   } 
}
