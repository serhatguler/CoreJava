package day20collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        /*
            1-ArrayListler eleman ekleme ve silmede bassarisizlardir
            Bu yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayListler in kullanilmasi tavsiye edilmez

            2- Linkedlistleri index kullanmadiklarindan eleman ekleme ve silme de re-index yapuilmasina gerek yoktur.
               Bu da linkedlistleri elema ekleme ve silmede basarili hale getirir.

            3-Arraylistlerde search islemi kolay yapilir., cunku indexler adres gibidir.

            4-Listlerde search islemi zor yapilir., cunku listlerde index kullanilmazlar.
            Index kullanilmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir


         */


        LinkedList<String> list = new LinkedList<>();
        list.add("Mehmet");
        list.add("derya");
        list.add("Melih");
        list.add("serhat");
        list.add("tuba");
        System.out.println(list); //[Mehmet, derya, Melih, serhat, tuba]

        list.add(1, "Zafer");
        System.out.println(list);//[Mehmet, Zafer, derya, Melih, serhat, tuba]

        list.addFirst("jace");
        System.out.println(list);//[jace, Mehmet, Zafer, derya, Melih, serhat, tuba]

        list.remove("Mehmet");
        System.out.println(list);//[jace, Zafer, derya, Melih, serhat, tuba]


        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty
        System.out.println(list.peek());//ilk node u silmeden verir.
        System.out.println(list);

        //Retrieves and removes the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty
        System.out.println(list.poll());
        System.out.println(list);

        /*
            Note: peek() ile element() ikiside ayni elemani verir.
            peek() list bos oldugunda null verir. element ise hata verir.


         */

        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list
            Throws:NoSuchElementException – if this list is empty
         */
        System.out.println(list.element());

        /*
            poll ile pop ikiside  ilk elemani siler.
            poll() list bos ise null verir, pop() ise hata verir
         */

        System.out.println(list.pop());
        System.out.println(list);

    }

}
