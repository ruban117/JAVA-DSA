//print subarrays
import java.util.Scanner;

public class Print_Subarrays {
    public static void Subarrays(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+",");
                }
                total++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Total Subarrays Are:- "+total);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,58,69};
        Subarrays(arr);
    }
}
