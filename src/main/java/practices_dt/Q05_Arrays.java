package practices_dt;

public class Q05_Arrays {
    public static void main(String[] args) {
        //Create a String array, add 5 elements in it,
        // find the sum of the number of the characters in all Strings

        String[] countries = {"Turkey", "Russia", "Japan", "Sweden", "Canada"};
        int sum = 0;
        for(String w: countries){
           sum += w.length();
        }
        System.out.println(sum);



        }
    }