import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number:- ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The Number Is Even");
        }
        else{
            System.out.println("The Number Is Odd");
        }
    }
}
