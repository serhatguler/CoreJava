package day03_scanner_concatenation;

import java.util.Scanner;

public class C02ScannerClass02 {
    public static void main(String[] args) {
        //Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width and the length of a rectangle to calculate the perimeter and the area");

        double width = input.nextDouble();
        System.out.println(width);

        double length = input.nextDouble();
        System.out.println(length);

        System.out.println("area:" + width*length);

        System.out.println("perimeter:" + 2*(length+width));

    }
}
