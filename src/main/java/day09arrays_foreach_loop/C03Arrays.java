package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int [] numbers = {12, 3, -3, 5, 23};

        for (int w:numbers) {
            if (w<5){
                System.out.println(w + " ");
        }

    }
        //Example 6: Check if a specific element exists in an array or not.
        int[] nums = {12, 3, 14, 5, 23};
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        int result = Arrays.binarySearch(nums,5);
        System.out.println(result);

    }
}

