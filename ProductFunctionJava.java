import java.util.Scanner;
public class ProductFunctionJava {
    public static int Product(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:- ");
        int num2=sc.nextInt();
        System.out.println("The Product Of "+num1+" and "+num2+" Is:- "+Product(num2, num2));
    }
}
