package day24lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C01Lambda {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(17);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        System.out.println(findSquareOfDistinctEvents(nums));
        System.out.println(findMultiplicationOfDistinctOddLastDigitOfodds(nums));
        System.out.println(findMax1(nums));

    }

    //Example1 : Create a method to calculate  the sum of the squares of distinct even elements

    public static int findSquareOfDistinctEvents(List<Integer> list){
        return list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);
    }

    //Example2 : Create a method to calculate  the multiplication of the last digit of distinct odd elements
    public static int findMultiplicationOfDistinctOddLastDigitOfodds(List<Integer> list){
        return list.stream().distinct().filter(t->t%2!=0).map(t->t%10).reduce(1,(t,u)->t*u);
    }

    //Example2 : Find the max element in the list
    //1.Way:
    public  static  int findMax1(List<Integer> list){
        return list.stream().distinct().reduce(list.get(0), (t,u)->t>u ? t:u);
    }

    //2.Way: we can do ascending order then the last element will be the max
    public  static  int findMax2(List<Integer> list){
        return list.stream().distinct().sorted().reduce((t,u)->u).get();
    }

    //3.Way: we can do descending order then the first element will be the max
    public  static  int findMax3(List<Integer> list){
        return list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
    }

    //Example1 : Create a method find the min value which is greater than 7 and even from list.

    public static int findMinEvenGreaterThanSeven(List<Integer> list){
        return list.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
    }


}
