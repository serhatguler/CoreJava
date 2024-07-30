package day12_date_time_enum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //12:08:47.848524400

        /*
            DateTime Class ta kullanilan tarih ve saat formatlari
                HH:mm   ==> 24'lu saat sistemi
                hh:mm   ==> 12'li saat sistemi AM, PM gosterilmez
                HH:mm a  ==>12'li saat sistemi AM, PM
                HH:mm :ss  ==>saniyeyi gosterir
                mm : minute demek , MM: month demek

                dd-MM-yyyy =>> day-month-year
                MMM  =>> Aug
                MMMM =>> AUGUST


         */


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH: mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime); //12: 26

        //Date Formati
        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate2 = dtf2.format(myCurrentDate);//Stringe cevirdik
        System.out.println(formattedDate2); //July/30/2024

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate); //2024-07-30
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd:MMM:yyyy");
        String formattedDate3 = dtf3.format(myDate);
        System.out.println(formattedDate3); //30:Jul:2024

        //Baska bir zaman dilimindeki tarih ve zaman nasil alinir?
        LocalDate localDateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateInTokyo);//2024-07-31

        LocalTime localTimeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localTimeInTokyo); //01:38:23.429447

        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd); //2024-07-30T12:39:12.159358100
    }
}
