package day23iterators_lambda;
/*
            1)"Iterators" do the same with the "loops"
            2)"loops" can create "infinite loops", this is risk for developers.
             "Iterators" do not have this risk.
             3)There is not any performance difference between "Iterators" and "loops"
            4)There are 2 types of iterators; i)Iterator: It can just "remove" the elements from a collection
                                              It cannot do update or add operations.
                                              It works just from right to left
                                  ii)ListIterator: It can "remove", "update", and "add"
                                                   It works from "right to left" and from "left to right"
         */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04Iterators {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        //Type code to remove all elements except Clara from the given list by using Iterator
        Iterator<String> itr = myList.iterator(); // [ Tom, Jim, Clara, Angie, Mark ]

        while(itr.hasNext()){
            String el = itr.next();
            if(!el.equals("Clara")){
                itr.remove();
            }
        }
        System.out.println(myList);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jim");
        list.add("Clara");
        list.add("Angie");
        list.add("Mark");
        System.out.println(list);

        ListIterator<String> litr = list.listIterator();// [ Tom, Jim, Clara, Angie, Mark ]

        //Type code to print all elements in reverse order by adding "!" to the end.
        // Mark! Angie! Clara! Jim! Tom!
        while(litr.hasNext()){
            litr.next();
        }

        while(((ListIterator<?>) litr).hasPrevious()){ // [ Tom, Jim, Clara, Angie, Mark ]
            String el = litr.previous();
            System.out.print(el + "! ");
        }

    }
}
