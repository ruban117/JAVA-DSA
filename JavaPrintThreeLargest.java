import java.util.Scanner;
public class JavaPrintThreeLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Number:- ");
        int a=sc.nextInt();
        System.out.print("Enter The Second Number:- ");
        int b=sc.nextInt();
        System.out.print("Enter The Third Number:- ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest Number Is:- "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest Number Is:- "+b);
        }
        else{
            System.out.println("Largest Number Is:- "+c);
        }
    }
}
