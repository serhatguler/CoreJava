package day06string_manipulations_loops;

public class Day6Review {
    public static void main(String[] args) {
        //Example 1: Count the alphabetical characters in a given String
        //Tom12 Hanks!... ==> 8

        //i)Remove non-alphabetical characters ii)Count the remaining characters
        String name = "Tom12 Hanks!... ";
        int newName = name.replaceAll("[^A-Za-z]", "").length();
        System.out.println(newName);

        //Example 2: Type code to change all digits to "*" in a given password
        //           pwd: a12b32c! ==> a**b**c!
        String pwd = "a12b32c!";
        String newPwd = pwd.replaceAll("[0-9]", "*");
        System.out.println(newPwd);

        //Example 3: Get initials from a full name. (Middle name is out of scope)
        //           Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM Hanks   " ==> TH

        String fame = "   tOM Hanks   ";
        System.out.println(fame);
        String first = fame.trim().substring(0,1).toUpperCase();
        System.out.println(first);
        String second = fame.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(second);
        System.out.println(first + second);

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234
        String card = "1234 1234 1234 1234";
        String cardNumber = card.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(cardNumber);
        String cardNumber2 = card.substring(15);
        System.out.println(cardNumber2);
        System.out.println(cardNumber + cardNumber2);

        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        String sentence = "Tom Hanks was born in 1975.";
        int newSec = sentence.replace(" ", "").length();
        System.out.println(newSec);

        /*
            Example 4:Check if a password has the following conditions
                      i)It should not be empty
                      ii)It should not be just space
                      iii)It should not have spaces at the beginning and at the end
                      iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
                      v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        */


        String pass = "A12?iKm";
        // i)It should not be empty
        boolean bir = pass.isEmpty();
        System.out.println(bir);
        // ii)It should not be just space
        boolean iki = pass.isBlank();
        System.out.println(iki);
        // iii)It should not have spaces at the beginning and at the end
        boolean uc = pass.trim().equals(pass);
        System.out.println(uc);
        // iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        boolean dort = pass.indexOf("i")==4;
        System.out.println(dort);
        // v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        boolean bes = pass.indexOf("K")==5;
        System.out.println(bes);
        if(!bir && !iki && uc && dort && bes){
            System.out.println("password is valid");
        }else{
            System.out.println("invalid");
        }

        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        //1.Step: Remove currency symbols or characters different from "digits" and "."
        String price1 = shirtPrice.replaceAll("[^0-9.]", "");
        System.out.println(price1);
        String price2 =bookPrice.replaceAll("[^0-9.]", "");
        System.out.println(price2);
        //2.Step: Change String data type to a numeric data type
        double newShirt = Double.valueOf(price1);

        double newBook =Double.valueOf(price2);

        System.out.println(newBook+newShirt);































    }
}
