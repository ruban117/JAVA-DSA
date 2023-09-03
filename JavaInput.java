import java.util.Scanner;
public class JavaInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter Your Name:- ");
        //String name=sc.next();//takes the first letter of the name
        System.out.print("Enter Your Full Name:- ");
        String fullname=sc.nextLine();//takes the full name
        System.out.print("Enter An Integer:- ");
        int num=sc.nextInt();
        System.out.print("Enter Any Decimal Number:- ");
        float decinum=sc.nextFloat();
        //System.out.println(name);
        System.out.println(fullname);
        System.out.println(num);
        System.out.println(decinum);
    }
}
