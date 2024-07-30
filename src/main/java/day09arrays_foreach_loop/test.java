package day09arrays_foreach_loop;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String[] names = new String[5];
        System.out.println(names);

        names[1] = "nbfdoa";
        names[3] = "Acew";
        System.out.println(Arrays.toString(names));
        String get = names[1];
        System.out.println(get);

        //Example 1: Create an integer array, then find the multiplication of all elements

        int[] number = {1, 2, 4, 4, 5};

        int multiplication = 1;
        for (int i = 0 ; i<number.length ; i++){
            multiplication = multiplication*number[i];
        }
        System.out.println(multiplication);

        int m = 1;
        for (int w:number) {
            m= m*w;
        }
        System.out.println(m);
        //Example 2: Find the difference between maximum and minimum value of array elements
        //           [8, 12, 34, 10, 78, 19]  ==> 78 - 8 = 70
        int[] arr ={ 8, 12, 34, 10, 78, 19};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max= arr[arr.length-1];
        System.out.println(max-min);

        int maxiumum = arr[0];
        int mimimum = arr[0];
        for (int w: arr){
            maxiumum = Math.max(maxiumum,w);
            mimimum = Math.min(mimimum,w);
        }
        System.out.println(maxiumum-mimimum);

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings

        String[] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando"};
        int sum = 0;
        for (String w: cities){
            sum+=w.length();
        }
        System.out.println(sum);

        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]

        int[] numbers = {0, 2, 3, 0, 12, 0};
        int[] newNumbers = new int[numbers.length];
        int index=0;
        for (int w: numbers){
            if (w!= 0){
                newNumbers[index]=w;
                index++;
            }

        }
        System.out.println(Arrays.toString(newNumbers));

        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int[] x = {12, 3, -3, 5, 23};
        for (int w : x){
            if (w<5){
                System.out.print(" "+ w);
            }
        }
        //Example 6: Check if a specific element exists in an array or not.
        int[] nums = {12, 3, 14, 5, 23};
        Arrays.sort(nums);
        int result = Arrays.binarySearch(nums, 90);
        System.out.println(result);

    }
}
