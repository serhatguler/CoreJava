package day03_scanner_concatenation;

import java.util.Scanner;

public class C04ScannerClass04 {
    public static void main(String[] args) {


        //Example 4: Ask user to enter 5 digit integer like 45678
        //           Type code to print the sum of the first two and the last two numbers
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer with 5 digits");

        int num = input.nextInt();

        int first2 = num / 1000;

        // "%" is "modulus operator", it returns the "remainder" in a division operation
        // If you need last digit in an integer, use "%10"

        int last2 = num % 100;

        System.out.println(first2 + "+" + last2 + "=" + (first2 + last2));


    }
}
