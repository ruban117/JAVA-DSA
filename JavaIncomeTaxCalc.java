import java.util.Scanner;
public class JavaIncomeTaxCalc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Yout LPA:- ");
        float lpa=sc.nextFloat();

        if(lpa<=500000){
            System.out.println("Tax is:- "+lpa*0);
        }
        else if((lpa>500000)&&(lpa<=1000000)){
            System.out.println("Tax is:- "+(lpa*0.2));
        }
        else{
            System.out.println("Tax is:- "+(lpa*0.3));
        }
    }
}