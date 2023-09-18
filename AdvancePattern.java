import java.util.Scanner;
public class AdvancePattern{
    /*
     * * * * *
     *       *
     *       *
     *       *
     * * * * *
     */
    public static void HolloPattern(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||j==1||j==col||i==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
         *
       * * 
     * * *
   * * * *
    */

    public static void InvertedHalfPyramid(int lines){
        for(int i=1;i<=lines;i++){
            //for spaces
            for(int j=1;j<=lines-i;j++){
                System.out.print("  ");
            }
            //for stars
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            //for new lines
            System.out.println();
        }
    }

    /*
     1 2 3 4 5
     1 2 3 4
     1 2 3
     1 2
     1
     */

     public static void InvertedHalfPyramidNumbers(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=lines-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }

    /*
     1 
     2 3
     4 5 6
     7 8 9 10
     11 12 13 14
     */

     public static void FloidTriangle(int lines){
        int c=1;
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c+=1;
            }
            System.out.println();
        }
     }

    

    public static void main(String[] args) {
        System.out.println("For Hollow Pattern");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for row:- ");
        int row=sc.nextInt();
        System.out.print("Enter the value for column:- ");
        int col=sc.nextInt();
        HolloPattern(row, col);
        System.out.println("\n\nFor Half Inverted Pyramid Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines=sc.nextInt();
        InvertedHalfPyramid(lines);
        System.out.println("\n\nFor Half Inverted Pyramid Number Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines2=sc.nextInt();
        InvertedHalfPyramidNumbers(lines2);
        System.out.println("\n\nFor Half Floids Number Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines3=sc.nextInt();
        FloidTriangle(lines3);
    }
}