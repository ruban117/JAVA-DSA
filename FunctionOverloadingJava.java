import java.util.Scanner;
public class FunctionOverloadingJava {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two numbers:- "+sum(10,20));
        System.out.println("Sum of three numbers:- "+sum(10,20,30));
    }
}
