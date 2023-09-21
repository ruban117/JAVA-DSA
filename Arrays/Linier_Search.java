package Arrays;

import java.util.Scanner;

public class Linier_Search {
    public static int Linier_Search(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
     public static int string_Linier_Search(String arr[], String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array");
        int size=sc.nextInt();
        sc.nextLine();
        //int arr[]=new int[size];
        String arr[]=new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Arr["+i+"]:- ");
            String x=sc.nextLine();
            arr[i]=x;
        }
        System.out.println("The Array Is:- ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }

        // for(int i=0;i<size;i++){
        //     System.out.print("Enter Arr["+i+"]:- ");
        //     int x=sc.nextInt();
        //     arr[i]=x;
        // }
        // System.out.println("The Array Is:- ");
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+",");
        // }
        // System.out.print("\nEnter The Number You Want To Search:- ");
        // int key=sc.nextInt();
        System.out.print("\nEnter The String You Want To Search:- ");
        String key=sc.nextLine();
        int x=string_Linier_Search(arr, key);
        if(x < 0){
            System.out.print("\nYour Given Key Is Not Present In The Array");
        }
        else{
            System.out.println("Your Key Is Present In The Array At The Position:- "+x);
        }
    }
}
