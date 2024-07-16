package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatement {
    public static void main(String[] args) {
        //Example 1: Type code gives you the name of the day after giving number of the day
        //           1 ==> Sunday  2 ==> Monday  ...  7 ==> Saturday
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of day...");
        byte numOfDay = input.nextByte();
        //1.Way:
        if(numOfDay==1){
            System.out.println("sunday");
        }else if(numOfDay==2){
            System.out.println("monday");
        }else if(numOfDay==3){
            System.out.println("tuesday");
        } else if(numOfDay==4) {
            System.out.println("wednesday");
        }else if(numOfDay==5){
            System.out.println("thursday");
        }else if(numOfDay==6){
            System.out.println("friday");
        }else if(numOfDay==7){
            System.out.println("saturday");
        }else{
            System.out.println("invalid number");
        }
        //2.Way:
        switch(numOfDay){
            case 1:
                System.out.println("sunday"); // 'BREAK' take you out of case
                break;
            case 2:
                System.out.println("monDAY");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesDAY");
                break;
            case 5:
                System.out.println("thursDAY");
                break;
            case 6:
                System.out.println("friDAY");
                break;
            case 7:
                System.out.println("saturDAY");
                break;
            default:
                System.out.println("invalid day number");
                break; // default is the last part in switch statement, that is why using "break" after default is optional

            //Note: You can use i)int ii)byte  iii)short  iv)char  v)String in switch statement
            //      float, double, long, boolean cannot be used in switch statement
        }









    }
}
