//pairs in an array

import java.util.Scanner;
class Array_Pairs{
    public static void PossiblePairs(int arr[]){
        int totalpairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totalpairs+=1;
            }
            System.out.println();
        }
        System.out.println("Total Pairs Are:- "+totalpairs);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Arr["+i+"]:- ");
            int x=sc.nextInt();
            arr[i]=x;
        }
        System.out.println("The Array Is:- ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("Pairs Of This Array Are:- ");
        PossiblePairs(arr);
    }
}