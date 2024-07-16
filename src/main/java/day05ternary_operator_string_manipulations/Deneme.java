package day05ternary_operator_string_manipulations;

public class Deneme {
    public static void main(String[] args) {

//        //Example 1: Count the alphabetical characters in a given String
//        //Tom12 Hanks!... ==> 8
//        String name = "Tom12 Hanks!...";
//        String newName = name.replaceAll("[^A-Za-z]","");
//        System.out.println(newName);
//        int num = newName.length();
//        System.out.println(num);
//
//        //Example 2: Type code to change all digits to "*" in a given password
//        //           pwd: a12b32c! ==> a**b**c!
//
//        String s = "a12b32c!";
//        String x = s.replaceAll("[0-9]","*");
//        System.out.println(x);


        //Example 3: Get initials from a full name. (Middle name is out of scope)
        //           Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM Hanks   " ==> TH

//        String name = "tom hanks";
//        String first =name.trim().substring(0,1).toUpperCase();
//        System.out.println(first);
//        String last = name.trim().split(" ")[1].substring(0,1).toUpperCase();
//        System.out.println(last);
//        System.out.println(first+last);

//        String name1 = "Ali Can";
//        String name2 = "Aliye Canan";
//        String name3 = "Aliyev Can Cananov";
//        int num1 = name1.replaceAll("[^A-Za-z]", "").length();
//        int num2 = name2.replaceAll("[^A-Za-z]", "").length();
//        int num3 = name3.replaceAll("[^A-Za-z]", "").length();
//        System.out.println(num3+num2+num1);
//
//        String cityName = " mIAMI ";
//        int len = cityName.length();
//        System.out.println(len);
//        String na = cityName.trim().substring(0,1).toUpperCase();
//        String name = cityName.trim().substring(1).toLowerCase();
//        System.out.println(na+name);

        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."
//        String sentence = "Tom Hanks was born in 1975.";
//        int a = sentence.trim().replaceAll("[ ]","").length();
//        System.out.println(a);

//        String s = "serhatdhabdlaidblabdna ";
//        String a= s.trim();
//        System.out.println(a);
//        int nw = a.length();
//        String newName =a.substring(nw-1);
//        System.out.println(newName);

//        String s = "Java";
//        int length = s.length();
//        String newS= s.trim().substring(0,length-1).toUpperCase();
//        System.out.println(newS);

        //Example 3: Type code to print just the unique characters in a String
        //           "Hello" ==> Heo
//        String s = "Hello";
//        if (s.indexOf("H")==s.lastIndexOf("H")){
//            System.out.print("H");
//        } if (s.indexOf("e")==s.lastIndexOf("e")) {
//            System.out.print("e");
//        } if (s.indexOf("l")==s.lastIndexOf("l")) {
//            System.out.print("l");
//        }if (s.indexOf("o")==s.lastIndexOf("o")){
//            System.out.print("o");
//        }

        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

//        String shirtPrice = "$12.99";
//        String bookPrice = "$35.99";
//        String shirt = shirtPrice.trim().replaceAll("[^0-9.]","");
//        String book = bookPrice.trim().replaceAll("[^0-9.]","");
//        double newShirt = Double.valueOf(shirt);
//        double newBook = Double.valueOf(book);
//        System.out.println(newBook+newShirt);

        //Example 7: Type a code to find the number of words used in a String
        //           "Learn Java, earn huge amount of money." ==> 7

//        String t = "Learn Java, earn huge amount of money.";
//        int space = t.trim().replaceAll("[^ ]","").length();
//
//        int num = space+1;
//        System.out.println(num);
//
//        int n = t.trim().split(" ").length;
//        System.out.println(n);

//        String s = "Java is Java";
//        boolean r =s.contains("v");
//        System.out.println(r);


    }
}