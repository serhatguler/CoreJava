package day19exceptions;

public class C07Exceptions {
    public static void main(String[] args) {

        printAge(63);
        printAge(-5); //java hata vermedi ama yas eksi olamaz.

    }
    public static void printAge(int age){

        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }


    }
}
