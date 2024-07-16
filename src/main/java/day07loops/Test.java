package day07loops;

public class Test {
    public static void main(String[] args) {
//        //Example 4: Type code to reverse a String (Interview Question)
//        //           Alexa ==> axelA
//        String s = "Alexa";
//        String reverse ="";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            reverse = reverse+s.charAt(i);
//        }
//        System.out.println(reverse);

        //Example 5: Type code to find the sum of the digits in an integer
        //           587 ==> 5+8+7 = 20
//        int num = -587;
//        num=Math.abs(num);
//        int sum =0;
//        for (int i = num; i >0; i=i/10) {
//            sum =sum+i%10;
//        }
//        System.out.println(sum);


        //Example 6: Type code to find unique characters in a String
        //           Hello ==> Heo
//        String t = "abbc";
//        String unique = "";
//        for (int i = 0; i <t.length() ; i++) {
//            char ch  = t.charAt(i);
//            if (t.indexOf(ch)==t.lastIndexOf(ch)){
//                unique = unique+ch;
//            }
//            System.out.println(unique);
//        }

//
//        String s = "accessories";
//        String repaeted ="";
//        for (int i = 0; i <s.length() ; i++) {
//            String x= s.substring(i,i+1);
//            if (s.indexOf(x)==s.lastIndexOf(x)){
//                continue;
//            }else {
//                if (!repaeted.contains(x)){
//                    repaeted=repaeted+x;
//                }
//            }
//
//        }
//        System.out.println(repaeted);

//        String s = "12345";
//        String empty = "";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            String x =s.substring(i,i+1);
//            empty=empty+x;
//        }
//        if (s.equals(empty)){
//            System.out.println(empty+ " empty is palindrome");
//        }else {
//            System.out.println(empty+ " empty is not palindrome");
//        }

//        Integer num = 223878;
//        String newString = String.valueOf(num);
//        String d ="";
//        for (int i = 0; i <newString.length() ; i++) {
//            String ch = newString.substring(i,i+1);
//            if (newString.indexOf(ch)==newString.lastIndexOf(ch)){
//                continue;
//            }else {
//                if (!d.contains(ch)){
//                    d=d+ch;
//                }
//            }
//            }
//

        /*
                Type code to draw the following image by using a for loop.
                A A A A
                A A A A
                A A A A
                A A A A
         */
//        int row = 3;
//        int column =4;
//        for (int i = 1; i <=row ; i++) {
//            String s="";
//            for (int j = 1; j <=column ; j++) {
//                s =s+" A";
//            }
//            System.out.println(s);
//        }

        /*
                Type code to draw the following image by using a for loop.
                 X X X X X
                 X X X
                 X
         */

//        int row = 3;
//        for (int i = row; i >=1 ; i--) {
//            String s = "";
//            for (int j = 1; j <= (2*i)-1 ; j++) {
//                s=s+" X";
//            }
//            System.out.println(s);
//        }

//       int row = 6;
//        for (int i = 1; i <=row ; i++) {
//            for (int j = row-i; j >=1; j--) {
//                System.out.print(" ");
//                for (int k = 1; k <=i ; k++) {
//                    System.out.println("* ");
//                    System.out.println();
//                }
//
//
//            }
//        }

//        String t = "Mark";
//        String reverse = "";
//        for (int i = t.length()-1; i>=0 ; i--) {
//            String s = t.substring(i,i+1);
//            reverse = reverse+s;
//        }
//        System.out.println(reverse);

        //Type all characters before the first occurrence of 'm' in a String
//        String s = "Christmas";
//        String empty = "";
//        for (int i = 0; i < s.length(); i++) {
//            String x = s.substring(i, i + 1);
//            if (x.equals("m")) {
//                break;
//            } else {
//                empty += x;
//            }
//        }
//        System.out.println(empty);

//        int n = 753;
//        int sum = 0;
//        for (int i = n; i >0 ; i=i/10) {
//            sum = sum+ i%10;
//        }
//        System.out.println(sum);

        //Type code to print unique characters in a String. For example; Hello ==> Heo
//        String s = "Hello";
//        String x ="";
//        for (int i = 0; i <s.length() ; i++) {
//            char ch = s.charAt(i);
//            if (s.indexOf(ch)==s.lastIndexOf(ch)){
//                x= x+ch;
//            }
//
//        }
//        System.out.println(x);



//        Type
//        X X X X X X
//        X X X X X
//        X X X X
//        X X X
//        X X
//        X
//
//        int rows =6;
//
//        for (int i = 1; i <=rows ; i++) {
//            String empty="";
//            for (int j = rows; j >=i ; j--) {
//                empty= empty+" X";
//
//            }
//            System.out.println(empty);
//        }




    }


}