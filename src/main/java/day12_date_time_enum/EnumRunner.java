package day12_date_time_enum;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        String capitalCity = UsStates.ALABAMA.getCapitalCity();
        System.out.println(capitalCity); //Montgomery

        //EXample: Ask user to enter name then give user capital city

        Scanner input = new Scanner(System.in);
        System.out.println("Enter state name");
        String state = input.nextLine().toUpperCase();
        switch (state){
            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;

            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapitalCity());
                break;
            default:
                System.out.println("Invalid state name ");

        }


    }
}
