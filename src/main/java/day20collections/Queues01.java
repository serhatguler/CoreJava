package day20collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("milk");
        depo.add("meat");
        depo.add("egg");
        depo.add("cheese");
        System.out.println(depo);//[milk, meat, egg, cheese]

        depo.remove();// ilk eklenen ilk silinir .FIFO
        System.out.println(depo);//[meat, egg, cheese]

        depo.clear();
        System.out.println(depo);//[]

        Queue<String> wareHouse = new PriorityQueue<>();
        wareHouse.add("egg");
        wareHouse.add("orange");
        wareHouse.add("banana");
        wareHouse.add("milk");
        System.out.println(wareHouse); //[banana, milk, egg, orange]

        //Double ended queu = iki uclu queue
        Deque<String> d = new LinkedList<>();
        d.add("egg");
        d.add("orange");
        d.add("banana");
        d.add("milk");
        System.out.println(d);//[egg, orange, banana, milk]



    }
}
