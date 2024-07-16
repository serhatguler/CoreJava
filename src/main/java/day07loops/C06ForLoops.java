package day07loops;

public class C06ForLoops {
    public static void main(String[] args) {
        //Example 10: Find the sum of the digits of decimal part in a double number
        //            28.587 ==> 5+8+7=20
        double n = 28.587; // split methodu kullan . dan sonra ayir. split sadece stringler de kullanilir , bu yuzden stringe cevir.
        //Change the double data type to String data type because I need split() method, and I can use it just with Strings
        String s = String.valueOf(n);
        //Use split() method to get the decimal part
        String ds = s.split("\\.")[1]; // eger . dan ayirmak istiyorsak split methodunda . basina \\ koy
        System.out.println(ds); // ds simdi string bu yuzden toplama yapayiz. integera cevir

        // Convert data type of "ds" to Integer
        int ids = Integer.valueOf(ds);
        System.out.println(ids); // ==>>>> simdi ineteger oldu
        int sum = 0;
        for (int i = ids; i > 0 ; i=i/10) {
            sum+= i%10;
        }
        System.out.println(sum);

    }
}
