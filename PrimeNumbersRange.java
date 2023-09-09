import java.util.Scanner;
public class PrimeNumbersRange {
    public static boolean Prime(int num){
        //boolean flag=true;
        if(num==2){
            return true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:- ");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
    }
}
