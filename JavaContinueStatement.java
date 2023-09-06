import java.util.Scanner;
public class JavaContinueStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do { 
            System.out.println("Enter Number:- ");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Number Is:- "+num);
        } while (true);
    }
}
