package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    /*
        1- FileNotFoundException ve IOException  Compile Time Exceptionlardir.
        2. FileNotFoundException path in dogrulugu ve dosyanin varligi ile ilgilidir.
           IOException  tum output ve input islemleri ile ilgilidir.
        3- IOException Class, FileNotFoundException classin parentidir. Istenirse FileNotFoundException yerine IOException kullanilablir
        4- IOException class ve FileNotFoundException class birlikte kullanilacaksa FileNotFoundException ustte, IOException class altta kullanilmalidir.
    */

public class C02Exceptions {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day20exceptions\\file.txt");

            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print( (char) k);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
