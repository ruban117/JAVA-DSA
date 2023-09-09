/*nCr=n!/r! *(n-r)! */
import java.util.Scanner;
public class BinomialCoefficientJava {
    public static int Factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r:- ");
        int r=sc.nextInt();
        float binomialcoefficient=(Factorial(n)/(Factorial(r) * Factorial(n-r)));
        System.out.println("The Binomial Coefficient is:- "+binomialcoefficient);
    }
}
