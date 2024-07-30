package day12_date_time_enum;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimi
        LocalDate myCurrenDate = LocalDate.now();
        System.out.println(myCurrenDate); //2024-07-30

        System.out.println(myCurrenDate.getMonthValue());//7
        System.out.println(myCurrenDate.getYear());//2024
        System.out.println(myCurrenDate.getDayOfMonth());//30
        System.out.println(myCurrenDate.getMonth());//JULY

        //ilerideki tarih nasil gidilir?
        System.out.println(myCurrenDate.plusYears(1).plusMonths(2).plusDays(1));//2025-10-01

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrenDate.minusMonths(1).minusDays(12)); //2024-06-18

        //Specific bir tarih objesi olustrma
        LocalDate date1 = LocalDate.of(1995,10,1);
        LocalDate date2 = LocalDate.of(1997,10,1);

        boolean r1 = date1.isAfter(date2); //Birinci tarih sonra mi ikinci tarihten
        System.out.println(r1); //false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2); //true

        /*
            Example: Kullanicidan aldigimiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
                     Kullanicidan aldigimiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz.
         */

        Scanner inout  = new Scanner(System.in);
        System.out.println("Please enter year, month, day numbers in the given order ");
        int year = inout.nextInt();
        int month = inout.nextInt();
        int day = inout.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid Date");
        }else {
            System.out.println("Enter time for ticket");
        }

        //Example2: Kullanicidan dogum tarihini alan ve girdigi tarihin gun ismini  bulan kodu yaziniz.
        System.out.println("Please enter year, month, day numbers in the given order ");
        int y = inout.nextInt();
        int m = inout.nextInt();
        int d = inout.nextInt();
        LocalDate date = LocalDate.of(y, m, d );
        System.out.println(date.getDayOfWeek());


    }

}
