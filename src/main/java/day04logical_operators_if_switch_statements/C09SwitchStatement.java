package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C09SwitchStatement {
    public static void main(String[] args) {
        //Example 2: Ask user to enter month name then print the month names from the given month name to the last month name
        //           October ==> October, November, December
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month name");
        String monthName = input.next().toLowerCase();
        switch(monthName){
            case "january":
                System.out.println("january");
            case "february":
                System.out.println("february");
            case "march":
                System.out.println("march");
            case "april":
                System.out.println("april");
            case "may":
                System.out.println("may");
            case "june":
                System.out.println("june");
            case "july":
                System.out.println("july");
                break;
            default:
                System.out.println("invalid month name");
        }
    }
}
