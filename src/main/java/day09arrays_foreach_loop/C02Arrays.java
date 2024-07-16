package day09arrays_foreach_loop;

import java.util.Arrays;

public class C02Arrays {
    public static void main(String[] args) {
        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings
        String [] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando"};
        System.out.println(Arrays.toString(cities));
        int sum = 0;
        for(String w : cities ){
            sum+= w.length();
        }
        System.out.println(sum);
        //Note 1: Arrays can contain just "primitive data types" and "references"
        //Note 2: Strings use "length() method", Arrays use "length variable"

        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
        int [] m = {0, 2, 3, 0, 12, 0};
        int [] n = new int[m.length];
        int idx = 0;

        for (int w:m) {
            if(w!=0){
                n[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(n));


    }
}
