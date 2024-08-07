package practice02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int i =0;
//        while (i<3){
//            System.out.println("==================");
//            String b =input.next();
//            int a = input.nextInt();
//
//            System.out.printf( "%-15s%03d %n", b, a);
//
//            i++;
//        }
//        System.out.println("==================");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter integer n");
//        int n = input.nextInt();
//        String s = String.valueOf(n);
//        if (n>=-100 && n<=100 ){
//            System.out.println("Good Job");
//        }else {
//            System.out.println("Wrong answer");
//        }







    }
    boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }



}
