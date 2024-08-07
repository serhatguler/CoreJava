package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

import java.util.ArrayList;
import java.util.List;

public class Review {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        integers.add(1,23);
        System.out.println(integers);


        ArrayList<String> r = new ArrayList<>();
        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");

        System.out.println(r);// [Miami, New York, Tampa, Virginia]

        for (int i =0; i<r.size(); i++){
            String city = r.get(i);
            if (city.contains("a")){
                r.remove(city);
                i--;
            }
        }
        System.out.println(r);








    }
}
