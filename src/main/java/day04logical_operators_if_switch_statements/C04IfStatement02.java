package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {
        //Example 3: Ask user to enter initial of the day names, then print all possible day names on the console.
        //           S ==> Sunday, Saturday     T ==> Tuesday, Thursday
        // m t w t f s s
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the day name...");
        char dayNameInitial = input.next().charAt(0); //To get char from user use input.next().charAt(0);
        if (dayNameInitial== 's' || dayNameInitial== 'S'){
            System.out.println("saturday and sunday");
        } else if(dayNameInitial== 'm' || dayNameInitial== 'M') {
            System.out.println(" monday");
        }else if(dayNameInitial== 't' || dayNameInitial== 'T'){
            System.out.println("thursday,tuesday");
        } else if(dayNameInitial== 'f' || dayNameInitial== 'F'){
            System.out.println("friday");
        }else{
            System.out.println("wednesday");
        }
    }
}
