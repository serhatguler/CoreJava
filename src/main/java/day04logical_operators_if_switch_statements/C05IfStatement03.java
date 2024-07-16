package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C05IfStatement03 {
    public static void main(String[] args) {
        //Example 4: Type code to decide a day name is week day name or weekend day name
        //           Monday ==> Week Day       Saturday ==> Weekend Day
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = input.next();
        //in order to compare strings we use '.equals'method instead '=='
        if(dayName.equalsIgnoreCase("saturday")|| dayName.equalsIgnoreCase("sunday")){
            System.out.println("weekend");
        } else if(dayName.equalsIgnoreCase("monday")||dayName.equalsIgnoreCase("tuesday")||dayName.equalsIgnoreCase("wednesday")||dayName.equalsIgnoreCase("thursday")||dayName.equalsIgnoreCase("friday")) {
            System.out.println("weekday");
        }else{
            System.out.println("invalid day");
        }
    }
}
        /*
                    2WAY
         boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if(isWeekEndDay){
            System.out.println("Weekend Day");
        }else if(isWeekDay){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }
         */

