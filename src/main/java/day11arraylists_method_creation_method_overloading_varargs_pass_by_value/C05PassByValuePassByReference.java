package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C05PassByValuePassByReference {
    /*
        PassByValue     :  1- Orjinal degerin korunmasini saglar.Orjinal yerine kopyasini verir.

        PassByReference :   Metoda reference yollanir.
                            Adress yollaninca metod adresi kullanrak adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir.


     */
    public static void main(String[] args) {
        int n = 5;
        int m = 7;

        int sum = add(n, m);
    }

    public static int add(int... a){
        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }
        return sum;
    }
}
