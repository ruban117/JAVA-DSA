import java.util.Scanner;
public class JavaPrimeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        System.out.print("Enter any number:- ");
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
