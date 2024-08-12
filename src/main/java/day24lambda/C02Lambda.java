package day24lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02Lambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Alex", "Jim", "Michael", "Mary", "Alexander", "Alex"));
        printUpperCaseSorthWithLength(names);
        System.out.println();
        System.out.println(sorthEleemntsWithLengthThenAlphabetical(names));
        System.out.println(checkToBeGreaterThan(names, 2));
        System.out.println(checkAnyElementToBeGreaterThan(names,3));
        System.out.println(checkNotStartWithGivenValue(names, "x"));
    }

    //Ex1: Print the list elements on the console with all characters in uppercase by sorting in ascending order by using length
    public static void printUpperCaseSorthWithLength(List<String> list){
//        list.stream().map(t->t.toString().
//                toUpperCase()).
//                sorted(Comparator.comparing(t->t.length())).
//                forEach(t-> System.out.print(t+ " "));
        list.stream().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length)).
                forEach(t-> System.out.print(t+ " "));
    }

    //Ex2: Sort the elements by using their lengths, is the elements are the same put in the alphabetical order
    public static List<String> sorthEleemntsWithLengthThenAlphabetical(List<String> list){
        return list.stream().sorted(Comparator.comparing(t->t.toString().length()).thenComparing(t->t.toString().charAt(0))).
                collect(Collectors.toList());
    }

    //Ex3: Create a method checks if the length of all elements are greater than given value
    public static boolean checkToBeGreaterThan(List<String> list, int num){
        return list.stream().allMatch(t->t.length()>num);
    }

    //Ex4: Create a method checks if the length of any elements are greater than given value
    public static boolean checkAnyElementToBeGreaterThan(List<String> list, int num){
        return list.stream().anyMatch(t->t.length()>num);
    }

    //Ex5: Create a method checks if no elements starts with the given value
    public static boolean checkNotStartWithGivenValue(List<String> list, String s){
        return list.stream().noneMatch(t->t.substring(0,1).equals(s));
    }


}
