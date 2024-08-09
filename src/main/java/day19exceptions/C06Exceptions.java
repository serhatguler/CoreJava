package day19exceptions;
/*

    NullPointerException:String degeri null oldugu zaman String metodlarini kullanamazsiniz


 */

public class C06Exceptions {

    public static void main(String[] args) {

        String s ="java";
        getNumberOfChar(s);

        String u =null;
        getNumberOfChar(u);
    }

    public static void getNumberOfChar(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.err.println("Null degerleri icin string metodlari kullanilamaz");
        }
    }
}
