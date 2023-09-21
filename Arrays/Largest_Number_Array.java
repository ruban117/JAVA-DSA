
import java.util.Scanner;
public class Largest_Number_Array {
    public static int FindLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The Smallest Number of the array is:- "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Arr["+i+"]:- ");
            int x=sc.nextInt();
            arr[i]=x;
        }
        System.out.println("The Largest Number of the array is:- "+FindLargest(arr));
    }
}
