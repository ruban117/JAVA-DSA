/* Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative.*/

import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number:- ");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("The Number Is Negative");
        }
        else{
            System.out.println("The Number Is Positive");
        }

        /*Question 2 : Finish the following code so that it prints You have a fever if your temperature
        is above 100 and otherwise prints You don't have a fever.
        */
        System.out.println("Enter your body temperature:- ");
        double temperature=sc.nextDouble();
        if(temperature>100){
            System.out.println("You Have Feaver");
        }
        else{
            System.out.println("You Are Fit");
        }

        /*Question 3 : Write a Java program to input week number(1-7) and print day of week name
        using switch case.
        */
        System.out.println("Enter The Number According To Week Days:- ");
        int number=sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Input");
        }
        /*What will be the value of x & y in the following program: */
        int A = 63, B = 36;
        boolean x = (A < B ) ? true : false;
        int y= (A > B ) ? A : B;
        System.out.println(x);
        System.out.println(y);

        /*Question 5 : Write a Java program that takes a year from the user and print whether that
        year is a leap year or not.
        */
        System.out.println("Enter Any Year:- ");
        int year=sc.nextInt();
        if(((year%4==0) && ((year%400 == 0) || (year%100!=0)))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
