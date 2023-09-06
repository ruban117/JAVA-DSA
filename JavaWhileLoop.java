import java.util.Scanner;
public class JavaWhileLoop{
    public static void main(String[] args) {
        int a=1;
        while(a<=100){
            System.out.println("Hello World "+a);
            a++;
        }
        int n=1;
        while(n<=10){
            System.out.println(n);
            n++;
        }

        System.out.println("Enter The Range:- ");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int c=1;
        while(c<=range){
            System.out.println(c);
            c++;
        }

        /*Sum Of N Natural Numbers */
        System.out.println("Enter The Range:- ");
        //Scanner sc=new Scanner(System.in);
        int range1=sc.nextInt();
        int count=1;
        int sum=0;
        while(count<=range1){
            sum+=count;
            count++;
        }
        System.out.println("Sum of n "+range1+" Natural number is :- "+sum);

    }
}