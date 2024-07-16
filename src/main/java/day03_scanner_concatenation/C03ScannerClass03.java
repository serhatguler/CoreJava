package day03_scanner_concatenation;

import java.util.Scanner;

public class C03ScannerClass03 {
    public static void main(String[] args) {
        //Example 3: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label

        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");
        String name = input.nextLine();


        System.out.println("age");
        byte age = input.nextByte();


        System.out.println("height");
        float height = input.nextFloat();


        System.out.println("marital status");
        String status = input.next();

        System.out.println("marial status is" + status);
        System.out.println("height is "+ height);
        System.out.println("age is" + age);
        System.out.println("full name is " + name);




    }
}
