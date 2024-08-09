package day19exceptions;

public class C02Exceptions {

    /*

        NumberFormatException: Icinde rakamlar disinda karekter olan string i  sayiyya cevirmek icin verilen hatadir.
     */
    public static void main(String[] args) {

        String s ="1234a";
        convertStringToInt(s);

    }

    public  static void convertStringToInt(String s){

        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("karekter icermemesi gerekiyor");
            System.out.println(e.getMessage());
        }

    }
}
