package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {
    public static void main(String[] args) {
        //Nested If Statement
        //Example 6:
        //If a number is even then check if it is divisible by 3 or not.
        //If it is divisible by 3 the output will be “Perfect even number” otherwise, the output will be “Good even number.”
        //If the number is odd then check if it is divisible by 3 or not.
        //If it is divisible by 3 the output will be “Perfect odd number” otherwise, the output will be “Good odd number.”
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number.");
            }
        } else {
            if (num % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number.");
            }
        }
    }
}
//Note: Nested Structures need more time to be executed.
//      We do not prefer to use nested structures in Java.
//      If sth needs more time to be executed, it is called "It has time complexity"