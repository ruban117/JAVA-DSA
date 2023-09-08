


import java.util.Scanner;
public class JavaStarPattern {
    public static void main(String[] args) {
        /*Print this pattern(single star half pyramid)
            * 
            * *
            * * *
            * * * *

        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        /*inverted pyramid pattern
         * * * *
         * * *
         * *
         * 
        */
        System.out.print("Enter the range:- ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            for(int j=n1;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Half pyramid pattern
         1
         1 2
         1 2 3
         1 2 3 4
         */

         System.out.print("Enter the range:- ");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
        
         /*Character pattern
          A
          B C
          D E F
          G H I J
          */
        System.out.print("Enter the range:- ");
        int n=sc.nextInt();
        int count=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)count+" ");
                count+=1;
            }
            System.out.println();
        }
    }
}
