package day21collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C02Sets01 {
    public static void main(String[] args) {

        /*

            1- Setler tekrarsiz eleman (unique) depolamak icin kulanilir.
            2- 3 tane Set Classi vardir.
                i)HashSet Class:
                    Hash benzersiz id olusturma teknigidir. bu teknige Hashing teknik denir
                    HashSet elemanlari rastgele siralar.
                    HashSet elemeanlari siralmadigindan cok hizli calisir.
                    HashSetler null elaman kabul eder.

                 ii)LinkedHashSet Class:
                    LinkedHashSet  ler elemanlari sizin verdiginiz siraya gore dizer.. HashSet lere gore yavastir.
                    null kabul eder

                 iii)TreeSet Class:
                    TreeSet elemanlari natural order a gore siralar.
                    Bu yuzden cok yavastir, en yavastir. Mumkun oldugunca kulanmamaya calisiriz
                    null kabul etmez

         */

        //=========================== i)HashSet Class ==================

        HashSet<String> hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("kerem");
        hs.add("Sinem");
        hs.add("onur");
        System.out.println(hs);//[kerem, Sinem, Sinan, onur]
        hs.add("Sinem");//Tekrarli elemani eklerken hata vermez. sadece bir kere ekler
        System.out.println(hs);//[kerem, Sinem, Sinan, onur]
        hs.add(null);//null kabul eder.
        System.out.println(hs);//[null, kerem, Sinem, Sinan, onur]



        //====================== ii)LinkedHashSet Class ===================

        LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);//[313, 19, 7, 1,null] insertion ordera gore ekledi.

        LinkedHashSet<Integer> ls =new LinkedHashSet<>();
        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls);


        lhs.retainAll(ls);// lhs ile ls in ortak elemanlarini lhs icinde verir.
        System.out.println(lhs);//[313, 19]
        System.out.println(ls);//[313, 19, 17, 11]



        //============================ iii)TreeSet Class ====================================

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('g');
        ts.add('a');
        ts.add('z');
        ts.add('r');
        ts.add('u');
        // ts.add(null); nuull eleman olarak kabul edilemez.
        System.out.println(ts);//[a, g, r, u, z] natural order(ascending) siralar.




    }
}
