

import java.util.Scanner;

public class Call_By_Reference {
    public static void UpdateArray(int arr[], int c){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        c=100;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Arr["+i+"]:- ");
            int x=sc.nextInt();
            //sc.next();
            arr[i]=x;
        }
        System.out.println("Array Before Update");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
        int c=50;
        UpdateArray(arr, c);
        System.out.println("Array After Update");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println("Normal Variable:- "+c);
    }
}
