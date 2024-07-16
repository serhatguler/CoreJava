package practices_dt;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {

        /*
        Task: Ask user to enter his/her first name, age, height, and weight then print them on the console in this way:
First Name: …..
Last Name: …..
Age: …….
Height: …….
Weight: ……..
Note: Use only on “System.out.println();”

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name please");
        String firstName = scan.nextLine();

        System.out.println("enter your second name please");
        String secondName = scan.nextLine();

        System.out.println("enter your age please");
        int age = scan.nextInt();
        // byte age = scan.nextByte(); byte siniri -128 ile 129 arasi sinirlandirilir.

        System.out.println("enter your height please");
        double height = scan.nextDouble();

        System.out.println("enter your weight please");
        double weight = scan.nextDouble();


        System.out.println("firstName: " + firstName + "\n Last name "+ secondName + "\n age "+ age+ "\n weight "+ weight + "\n height s"+ height);



    }
}
