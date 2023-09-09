import java.util.Scanner;
public class SumUsingFunction {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:- ");
        int num2=sc.nextInt();
        System.out.println("Sum of "+num1+","+num2+" is:- "+sum(num1,num2));
    }
}
