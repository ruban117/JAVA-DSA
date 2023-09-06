import java.util.Scanner;
public class JavaDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int c=1;
        do { 
            System.out.println("Hello");
            c+=1;
        } while (c<=n);
    }
}
