import java.util.Scanner;
public class JavaTernaryOperator {
    public static void main(String[] args) {
        String type=(5%2 == 0)? "Even" : "Odd";
        System.out.println("The Number Is:- "+type);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:- ");
        int a=sc.nextInt();
        String res=(a > 33)? "Pass" : "Fail";
        System.out.println(res);
    }
}
