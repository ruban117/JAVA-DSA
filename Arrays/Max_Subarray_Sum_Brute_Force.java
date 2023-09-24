import java.util.*;
public class Max_Subarray_Sum_Brute_Force {
    public static void Max_Subarr_Sum(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                    if(sum > max_sum){
                        max_sum=sum;
                    }
                }
                System.out.print(" Sum="+sum+"  ");
            }
            System.out.println();
        }
        System.out.println("Maximum Sum Is:- "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={2,-4,6,8,-10,58,69};
        Max_Subarr_Sum(arr);
    }
}
