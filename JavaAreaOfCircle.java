import java.util.Scanner;
public class JavaAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radous Of the Circle:- ");
        int radous=sc.nextInt();
        double pi=3.14;
        double area=pi*(radous*radous);
        System.out.println("The Area of the circle is:- "+area);
    }
}

