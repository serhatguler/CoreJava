package day19exceptions;

public class C01Exceptions {

    /*

            Yazdigimiz kodlar calismazsa loglara bakariz.
            Java exception firlatiginda kodun calismasi durur. Kodun calismasini saglamak icin try catch ile exception
            olusturmasi ,uhtemel kodlari try catch blogu icine yazariz

            Exception i handle edebilmek icin 2 tane yontem vardir
            a- Exception icin gerekli cozum uretebiliriz. Buna exception handling denir.
               Bunu try catch ile yapabiliriz.
               try block yapilmasi gereken kodu yazar. problemsiz yaparsa catch block aktif edilmez.
               try block icinde hata yaklarsa catch devrye girer ve catch block icindeki kodlar calisir.
               try block da islem yapilirken exception olusrsa try block icerisindeki exceptiondan sonraki kodlar calismaz.
            b-Exception olustugunda bunu ilan eder ve geri cekiliriz. Buna Throw Exception denir.

     */

    public static void main(String[] args) {

        divide(12,3);
        divide(12,0); //ArithmeticException
        divide2(5,0);



    }


    //ArithmeticException yazdiginiz code da mat islemleri yapiyorsak alinabilecewk hatadir.
    public static void divide2(int a, int b){
        try { //bu islemi yapmaya dene
            System.out.println(a/b);
            System.out.println("try ici gorev tamamlandi");
        }catch (ArithmeticException e){ //hata ile karsilarsirsan alttaki kodu dene
            System.out.println("Do not divide by zero");
        }
        System.out.println("tryy-catch sonrasi gorev tamamlandi");
    }

        //if else ile hatayi cozme tavsiye edilmez.
    public static void divide(int a, int b){

        if (b==0){
            System.out.println("Do not by zero");
        }else {
            System.out.println(a/b);
        }

    }

}
