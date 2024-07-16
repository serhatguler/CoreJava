package day03_scanner_concatenation;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {






        //Example 4: Ask user to enter 5 digit integer like 45678
        //           Type code to print the sum of the first two and the last two numbers
        //           45678 ==> 45 + 78 = 123

        Scanner number = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        int no = number.nextInt();
        int first2 = no/1000;
        int last2 = no%100;
        int result43 = first2+last2;
        System.out.println(result43);












    }
}
