import java.util.Scanner;
public class JavaReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum=(sum*10)+r;
            num/=10;
        }
        System.out.println(sum);
    }
}