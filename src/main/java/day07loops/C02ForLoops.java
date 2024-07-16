package day07loops;

public class C02ForLoops {
    public static void main(String[] args) {
        //Example 4: Type code to reverse a String (Interview Question)
        //           Alexa ==> axelA
        String s = "Alexa";
        String reversed = "";
        for (int i = s.length()-1; i>=0 ; i--) {
            reversed=reversed+s.charAt(i);
        }
        System.out.println(reversed);

        //Example 5: Type code to find the sum of the digits in an integer
        //           587 ==> 5+8+7 = 20
        int num = -587;
        num = Math.abs(num);
        int sumOfDigits = 0;

        for (int i = num ; i>0 ; i=i/10) {
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);

        //Example 6: Type code to find unique characters in a String
        //           Hello ==> Heo
        String t = "abbc";
        String unique = "";

        for(int i=0; i<t.length(); i++){

            char ch = t.charAt(i);

            if(t.indexOf(ch) == t.lastIndexOf(ch)){
                unique = unique + ch;
            }
        }
        System.out.println(unique);





    }
}
