import java.util.Scanner;
public class JavaTypePromotion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a='a';
        short b=50;
        System.out.println(a+b);

        int c=10;
        float d=20.25f;
        long e=25;
        double f=30;
        System.out.println(c+d+e+f);

        byte g=5;
        g=(byte) (g*2);
        System.out.println(g);
    }
}
