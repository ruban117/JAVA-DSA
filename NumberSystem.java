import java.util.*;
public class NumberSystem {
    public static int BinaryToDecimal(int binary){
        int sum=0;
        int incr=0;
        while(binary!=0){
            int r=binary%10;
            sum+=Math.pow(2,incr)*r;
            incr+=1;
            binary/=10;
        }
        return sum;
    }

    public static int DecimalToBinary(int decimal){
        int incr=0;
        int binary=0;
        while(decimal!=0){
            int rem=decimal%2;
            binary+=rem*Math.pow(10,incr);
            incr++;
            decimal/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number only 0 and 1:- ");
        int binary=sc.nextInt();
        System.out.println("Binary Number Is:- "+binary+" Equivalent Decimal Is:- "+BinaryToDecimal(binary));
        System.out.print("Enter Any Decimal Number to convert into binary:- ");
        int decimal=sc.nextInt();
        System.out.println("Decimal Number Is:- "+decimal+" Equivalent Binary Is:- "+DecimalToBinary(decimal));
    }
}
