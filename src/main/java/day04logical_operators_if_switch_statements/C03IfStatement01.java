package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {

    public static void main(String[] args) {
        // if it rains , i will cancel the picnic
        int a = 5;
        int b = 2;
        // if statement is used to execute codes under the some conditions.
        //if the condition is true/ the code will be executed otherwise, it will not executed.
        if(a%b==1){
            System.out.println("activated");
        }
        //Example 1: Type code to print "Even" for even integers and "Odd" for odd integers.
        //           Get the numbers from the user
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to check if it is even or odd");

        int x = input.nextInt();

       //1.Way
        if(x%2==0){
            System.out.println("number is even");
        }
        if(x%2!=0){
            System.out.println("number is odd");
        }
        //2,Way
        if (x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        //Example 2: Type code to check if a number is positive, negative or neutral
        System.out.println("enter a number and then check if it is positive, negative or neutral ");
        double y = input.nextDouble();


        if(y>0){
            System.out.println("positive");
        } else if(y==0) {
            System.out.println("neutral");
        }else{
            System.out.println("negative");
        }



    }
}
