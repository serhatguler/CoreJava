package day19exceptions;
/*

    try kisminda birden fazla catch olusabilir.Coklu catch blogunda parent-child iliskisi yoksa catchlerin sirasi onemli degildir.
    Coklu catch blogunda parent-child iliskisi varsa catchlerin sirasi onemlidir. Child class ustte olmak zorundadir
 */

public class C05Exceptions {

    public static void main(String[] args) {
        int a =12;
        int b= 0;
        String s = "AliCan";

        getCharFromString(s,a,b);
    }
    public static  void getCharFromString(String s, int a, int b){
        try {
            int idx =a/b;
            char ch =s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index");
        }


    }

}
