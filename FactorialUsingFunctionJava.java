import java.util.Scanner;
public class FactorialUsingFunctionJava {
    public static int Factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is:- "+Factorial(num));
    }
}
