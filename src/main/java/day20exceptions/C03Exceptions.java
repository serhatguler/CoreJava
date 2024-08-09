package day20exceptions;

public class C03Exceptions {

    /*
          1- Exception olsa da olmasa da calistirmamiz gereken kodlari finally block icinde yazariz
          2- database ile baglantiyi kesme isini yapan kodlar gibi kodlar her zaman calistirilmalidir.
            dolayisiyla bu tarz kodlari finally block icine yazariz.

          3- try tek basina kullanilmaz, try+catch olur -trt+ many catch olur
            try, catch blogu olmadan sadece finally ile de kullanilabilir.
          4- Many finally block kullanilamaz.

     */

    public static void main(String[] args) {

        int a=12;
        int b=0;
        int[] c={1,2,3,4,5};

        getNumberFromIntarray(c,a,b);

    }
    public static void getNumberFromIntarray(int[] c, int a, int b){

        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("cut the connection with database");
        }

    }
}
