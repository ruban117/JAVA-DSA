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


    public static void  ZeroOneTriangle(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern(int lines){
        //first half
        for(int i=1;i<=lines;i++){
            //printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //printing spaces
            for(int j=1;j<=2*(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=lines;i>=1;i--){
            //printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //printing spaces
            for(int j=1;j<=2*(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void RhombusStarsPattern(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=lines;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollo_Rhombus_Stars_Pattern(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=lines;j++){
                if(j==1 || j==lines ||i==1 || i==lines){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond_Pattern(int lines){
        //first half
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=lines;i>=1;i--){
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
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
        System.out.println("\n\nFor Half Zero One Triangle Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines4=sc.nextInt();
        ZeroOneTriangle(lines4);
        System.out.println("\n\nFor Butterfly Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines5=sc.nextInt();
        ButterflyPattern(lines5);
        System.out.println("\n\nFor Rhombus Star Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines6=sc.nextInt();
        RhombusStarsPattern(lines6);
        System.out.println("\n\nFor Hollo Rhombus Star Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines7=sc.nextInt();
        Hollo_Rhombus_Stars_Pattern(lines7);
        System.out.println("\n\nFor Diamond Star Pattern\n\n");
        System.out.print("How many Lines?:- ");
        int lines8=sc.nextInt();
        Diamond_Pattern(lines8);

    }
}