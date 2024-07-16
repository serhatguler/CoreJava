package day09arrays_foreach_loop;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {

//        String[] std = new String[5];
//        System.out.println(std);
//
//        std[0]="Jason";
//        std[1]="Serhat";
//        std[2]="Debbie";
//        std[3]= "Mrs Yu";
//        std[4]="Emma";
//        System.out.println(Arrays.toString(std));
//
//        String third = std[2];
//        System.out.println(third);

        //Example 1: Create an integer array, then find the multiplication of all elements
//        int[] ages = new int[4];
//
//        ages[0] = 12;
//        ages[1] = 5;
//        ages[2] = 7;
//        ages[3] = 1;
//
//        int multiplication = 1;
//        for (int i = 0; i < ages.length ; i++) {
//            multiplication = multiplication*ages[i];
//        }
//        System.out.println(multiplication);

//        int[] ages = new int[4];
//
//        ages[0] = 12;
//        ages[1] = 5;
//        ages[2] = 7;
//        ages[3] = 1;
//        int multiplication = 1;
//        for (int w:ages) {
//            multiplication = multiplication*w;
//        }
//        System.out.println(multiplication);

//        int [] nums = {8, 12, 34, 10, 78, 19};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//         int max = nums[nums.length-1];
//         int min = nums[0];
//        System.out.println(max-min);

//        int [] nums = {8, 12, 34, 10, 78, 19};
//        int max = nums[0];
//        int min = nums[0];
//        for (int w:nums){
//
//            max = Math.max(max,w);
//            min = Math.min(min,w);
//        }
//        System.out.println(max-min);

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings
//        String [] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando"};
//        System.out.println(Arrays.toString(cities));
//        int sum = 0;
//        for (String w: cities){
//            sum = sum+ cities.length;
//        }
//        System.out.println(sum);

        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
//        int m[]= {0, 2, 3, 0, 12, 0};
//        int n[]= new int[m.length];
//        int idx = 0;
//        for (int w:m){
//            if (w!=0){
//               n[idx]=w;
//               idx++;
//            }
//        }
//        System.out.println(Arrays.toString(n));

        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3
//        int[] numbers = {12, 3, -3, 5, 23};
//        for (int w : numbers) {
//            if (w < 5) {
//                System.out.println(w);
//            }
//
//
//        }


        /*
        Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */


//        int[ ] a = new int[ ]{ 12, 5, 8, 13};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        int middle = a.length/2;
//        if (a.length%2!=0){
//
//            System.out.println(a[middle]);
//        }else {
//            int midIndex = (a[middle]+a[middle-1])/2;
//            System.out.println(midIndex);
//        }

        // Find the smallest positive element and greatest negative element in an integer array
        // Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

//        int[] number = {-12, 18, -5, 23, -2};
//        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));//[-12, -5, -2, 18, 23]
//
//        int minPositive = number[number.length-1];
//        int maxNegative = number[0];
//        for (int w:number){
//            if (w<0){
//                maxNegative = Math.max(maxNegative,w);
//            }else {
//                minPositive = Math.min(minPositive,w);
//            }
//        }
//        System.out.println(maxNegative);
//        System.out.println(minPositive);

        // Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
        //Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

//        String[] b = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//        String initial ="";
//        for (String w:b){
//            if (w.endsWith("n") || w.endsWith("k")){
//              initial = initial+w.substring(0,1);
//            }
//        }
//        System.out.println(initial);

        // Find the elements whose length is the smallest in a String array
        // Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

//        String[] b = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//        int min = b[0].length();
//        for (String w:b){
//            min = Math.min(min,w.length());
//        }
//        for (String w:b){
//            if (min==w.length()){
//                System.out.println(w);
//            }
//        }

        //Count how many words start with 'a' or 'A' in a given String
//        String s = "Apex is an object oriented programming language";
//        String[] array = s.split(" ");
//        int counter = 0;
//        for (String w:array){
//            if (w.startsWith("A")||w.startsWith("a")){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        

    }
}
