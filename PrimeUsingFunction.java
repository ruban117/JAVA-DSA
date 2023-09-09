import java.util.Scanner;
public class PrimeUsingFunction {
    public static String Prime(int num){
        boolean flag=true;
        if(num==2){
            return "The number Is Prime";
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            return "The number is prime";
        }
        else{
            return "The number is not prime";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num=sc.nextInt();
        System.out.println(Prime(num));
    }
}
