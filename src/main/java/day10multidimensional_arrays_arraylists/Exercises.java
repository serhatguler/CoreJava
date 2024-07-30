package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
//        System.out.println(multiply(4, 5, 8));

//        String name = print("Ali"); cunku return type void ondan dolayi String olarak tanimlamayiz



//


//        Find the elements whose length is the smallest in a String array
//        Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

//        String[] b = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//
//        int minLength = b[0].length();
//        for(String w : b){
//            minLength = Math.min(minLength, w.length());
//        }
//        for(String w : b){
//            if(minLength == w.length()){
//                System.out.println(w);
//            }
//        }

//        int [][] a = new int[3][2];
//        a[0][1] = 3;
//        a[0][0] = 2;
//        a[1][0] = 5;
//        a[1][1] = 2;
//        a[2][0] = 7;
//        a[2][1] = 9;
//        System.out.println(Arrays.deepToString(a));

        //Example 1: Type code to find the total number of elements in a multidimensional array
//        String[][] b = { {"X", "U"}, {"a", "d", "m"}, {"T"} };
//        int num = 0;
//        for (String[] w : b){
//            num+= w.length;
//        }
//        System.out.println(num);

        // Example 2: Print the elements which has "a" in it from a multidimensional array
//        String[][] c = { {"Java", "is"}, {"easy"}, {"to", "learn"} };
//        // { {"Java", "is"}, {"easy"}, {"to", "learn"} }
//
//        for (String[] w:c){
//            for (String u:w){
//                if (u.contains("a")){
//                    System.out.println(u);
//                }
//            }
//        }

        //Example 3: Type code to find the maximum and minimum elements in a 2 dimensional integer array
//        int[][] n = { {5, 2}, {14, 9}, {-7} };
//        int max = n[0][0];
//        int min = n[0][0];
//        for (int[] w:n){
//            for (int u : w){
//                max = Math.max(max,u);
//                min = Math.min(min,u);
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
        //Example 4: Type code to convert a multidimensional array to a one dimensional array
        //           { {5, 2}, {14, 9}, {-7} } ==> { 5, 2, 14, 9, -7 }
//        int[][] p = { {5, 2}, {14, 9}, {-7} };
//        int length =0;
//        for (int[] w: p){
//            length+=w.length;
//        }
//        int[] r = new int[length];
//        int index = 0;
//        for (int[]w:p){
//            for (int u : w){
//                r[index] = u;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(r));
        //How to create an Arraylist
//        ArrayList<Integer> m = new ArrayList<>();
//
//        m.add(12);
//        m.add(32);
//        m.add(1,43);
//        m.add(12);
//
//        ArrayList<Integer> n = new ArrayList<>();
//        n.add(1);
//        n.add(2);
//        n.add(3);
//        m.addAll(1,n);
//        System.out.println(m);

        //Example 1: Create an Integer ArrayList and change the odd ones to 11
//        ArrayList<Integer> m = new ArrayList<>();
//        m.add(12);
//        m.add(13);
//        m.add(14);
//        m.add(15);
//        m.add(16);
//        m.add(16);
//        m.add(11);
//        for ( Integer w: m) {
//            if (w%2!=0){
//                m.set(m.indexOf(w),11 );
//            }
//        }
//        System.out.println(m);

        //Example 2: Create a String ArrayList and remove the elements contain a
//        ArrayList<String> r = new ArrayList<>();
//        r.add("Miami");
//        r.add("New York");
//        r.add("Tampa");
//        r.add("Virginia");
//
//        for (int i = 0; i <r.size() ; i++) {
//            if (r.get(i).contains("a")){
//                r.remove(i);
//                i--;
//            }
//
//        }
//        System.out.println(r);

        //Example 3: Create a character list which has repeated elements then remove the duplicates
        //           [J, a, v, a, c] ==> [J, a, v, c]
//        List<Character> a = new ArrayList<>();
//        a.add('J');
//        a.add('a');
//        a.add('v');
//        a.add('a');
//        a.add('v');
//        List<Character> b = new ArrayList<>();
//        for (Character w:a){
//            if (!b.contains(w)){
//                b.add(w);
//            }
//        }
//        System.out.println(b);

//        List<Integer> m = new ArrayList<>();
//        m.add(4);
//        m.add(6);
//        m.add(5);
//        m.add(-10);
//        m.add(8);
//        m.add(5);
//        m.add(20);
//        for (int i = 0; i <m.size() ; i++) {
//            for (int k = i+1 ; k<m.size() ; k++){
//                if (m.get(i)+m.get(k)==10){
//                    System.out.println(m.get(i)+ " and "+ m.get(k));
//                }
//            }







    }

}
