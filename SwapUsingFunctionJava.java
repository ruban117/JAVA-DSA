import java.util.Scanner;
public class SwapUsingFunctionJava {
    public static void swap(int a, int b){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap 1st number= "+a+" 2nd number:- "+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1=sc.nextInt();
        System.out.print("Enter the first number:- ");
        int num2=sc.nextInt();
        System.out.println("Before Swap 1st number:- "+num1+" 2nd number:- "+num2);
        swap(num1, num2);
    }
}
