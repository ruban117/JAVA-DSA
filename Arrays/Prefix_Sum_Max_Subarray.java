import java.util.Scanner;
public class Prefix_Sum_Max_Subarray {
    public static int PrefixSumMaxSubarray(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        int prefixarr[]=new int[arr.length];
        prefixarr[0]=arr[0];
        for(int i=1;i<prefixarr.length;i++){
            prefixarr[i]=prefixarr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=start == 0 ? prefixarr[end] : prefixarr[end]-prefixarr[start-1];
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        System.out.println(PrefixSumMaxSubarray(arr));
    }
}
