package day04logical_operators_if_switch_statements;

import java.util.Scanner;



public class Deneme {
    public static void main(String[] args) {

        //Example 6:
        //If a number is even then check if it is divisible by 3 or not.
        //If it is divisible by 3 the output will be “Perfect even number” otherwise, the output will be “Good even number.”
        //If the number is odd then check if it is divisible by 3 or not.
        //If it is divisible by 3 the output will be “Perfect odd number” otherwise, the output will be “Good odd number.”

        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        if (number%2 == 0){
            if (number%3 == 0){
                System.out.println("perfect even number");
            }else{
                System.out.println("Good even number");
            }
        }else {
            if (number%3==0){
                System.out.println("Perfect odd number");
            }else {
                System.out.println("good odd number");
            }
        }

    }
}
