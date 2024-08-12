package day23iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05Lambda {
    /*
        1- Lambda Functional Programming dir.
        2- Lambda Collectionlar ve Arrayler ile kullanilir.

     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12,5,7,3,88));
        printElements1(nums);
        System.out.println();
        printElments2(nums);
        System.out.println();
        printElements3(nums);
        System.out.println();
        printElements4(nums);



    }
    public static void printElements1(List<Integer> nums){
        for (Integer w:nums) {
            System.out.print(w + " ");
        }
    }

    public static void printElments2(List<Integer> nums){
      nums.stream().forEach(t-> System.out.print(t + " "));
    }

    //Example: Create a method to print even elements on the console in the same line with a space between them
    public static void printElements3(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach((t-> System.out.print(" "+ t)));
    }

    //Example: Create a method to print the square of odd elements in the console
    public static void printElements4(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));
        //map() is for changing existing method
        //distinct() displays repeated elements and make them unique

    }




}
