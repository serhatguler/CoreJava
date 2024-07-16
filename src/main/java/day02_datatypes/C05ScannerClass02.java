package day02_datatypes;

import java.util.Scanner;

public class C05ScannerClass02 {

    public static void main(String[] args) {

        //Get user's name
        //1 Step : Create Scanner Object

        Scanner input = new Scanner(System.in);

        //2 Step : Give message to user
        System.out.println("Enter your name ");

        //3 Step : GEt data from user

        String userName = input.nextLine();
        System.out.println(userName);






    }
}
