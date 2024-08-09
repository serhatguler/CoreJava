package day21collections;

import java.util.HashSet;
import java.util.TreeSet;

public class C03Set02 {
    public static void main(String[] args) {

        // Ex1 : Ogrenci email addresleini natural order da siralanmis olarak depolayiniz.

        //1 Way
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("p@gmail.com");
        emails.add("i@gmail.com");
        emails.add("e@gmail.com");
        emails.add("z@gmail.com");
        emails.add("t@gmail.com");
        emails.add("h@gmail.com");
        System.out.println(emails);

        //2 Way
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("q@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("a@gmail.com");
        System.out.println(emailsHs);

        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs); //burada Treeset ile siraladik .Sebebi ise daha hizli olmasi
        System.out.println(emailHsTs);


    }
}
