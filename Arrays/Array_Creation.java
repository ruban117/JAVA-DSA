
import java.util.Scanner;
public class Array_Creation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array");
        int size=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Arr["+i+"]:- ");
            String fruits=sc.nextLine();
            //sc.next();
            arr[i]=fruits;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
}
