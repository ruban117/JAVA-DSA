import java.util.Scanner;
public class JavaBreakStatement {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Enter a number:- ");
        int num=sc.nextInt();
        if(num%10==0){
            break;
        }
        System.out.println(num);
    }while(true);
    System.out.println("You entered a number which is multiplied by 10 thats why loop breaked");
  }  
}
