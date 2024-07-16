package day22collections_maps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        /*
        1)Whenever you need "FIFO"(First In First Out) scenarios, remember to use "Queue"s.
        2)You have 2 options to use "Queue"s; i)LinkedList:Uses insertion order   ii)PriorityQueue:Uses priority order.
        3)Deque is an interface, stands for Double Ended Queue, use it whenever you need to work with FIFO and LIFO
     */
        Queue<String> food = new LinkedList<>();
        food.add("Meat");
        food.add("Cheese");
        food.add("Egg");
        food.add("Fruit");
        food.add("Candy");
        System.out.println(food);// [Meat, Cheese, Egg, Fruit, Candy]

        PriorityQueue<String> f = new PriorityQueue<>();
        f.add("Meat");
        f.add("Cheese");
        f.add("Egg");
        f.add("Fruit");
        f.add("Candy");
        System.out.println(f);// [Candy, Cheese, Egg, Meat, Fruit]

        Deque<String> g = new LinkedList<>();
        g.addFirst("A");
        g.addFirst("B");
        g.add("X");
        g.addLast("Y");
        g.addFirst("X");
        g.addFirst("A");
        System.out.println(g);// [A, X, B, A, X, Y]

        g.removeFirst();
        g.removeLastOccurrence("X");
        String first = g.getFirst();

        System.out.println(first);// X
        System.out.println(g);// [X, B, A, Y]









    }
}
