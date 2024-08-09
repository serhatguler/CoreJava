package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
            1-  Run button una bastiktan sonra consolda alinan exceptionlara RunTime Exception denir.
                ArithmeticException, NumberFormatException vs...
                RunTime Exception lara Unchecked Exception denir.

            2-  Code yazarken dizi altindaki kirmizi cizgi seklinde alinan exceptionlara CompileTime Exception denir.
                CompileTime Exception lara checked Exception denir.

                               ===========interview sorusu======

                 Throw ile Throws keyword arasindaki farklar nelerdir?

             1- throw metod bodysi icinde, throws ise metod parentezinden hemen sonra kullanilir.

             2- throw metod bodysi icinde istenilen yerde istenildigi kadar kullanilabilir.
                throws ise metod parantezinden hemen sonra ve sadece 1 kere kullanilir.

             3- throw dan sonra new keyword ve constructor kullanrak object olusturulur.
                throwsdan sonra sadece Exception class ismi yazilir.

             4-  throw belli sartlar icin Exception firlatma da kullanilir.
                throws ise bir metodun belli bir Exception firlatabilecegini belirtmek icin kullanilir.
         */

public class C01Exceptions {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("src\\main\\java\\day20exceptions\\file.txt");

        int k =0;
        while ((k=fis.read())!=-1){
            System.out.print( (char) k);
        }

    }
}
