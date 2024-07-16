package practices_dt;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        // Type a code that calculates the hypotenuse
        // ucgenin hipotenusunu soruyor. a2+b2=c2 ;)

       // System.out.println(Math.sqrt((a*a)+(b*b)));

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of one leg of the right triangle");
        double a = scan.nextDouble();

        System.out.println("enter the length of second leg of the right triangle");
        double b = scan.nextDouble();

        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hypotenuse: " + c);



    }
}
