package day19exceptions;

public class C04Exceptions {
    /*
            ArrayIndexOutOfBoundsException:
     */

    public static void main(String[] args) {

        String[] arr = {"j","a", "v", "a"};

        getElementFromArray(arr, 1);
        getElementFromArray(arr, 5);
    }
    public static  void getElementFromArray(String[] s, int idx){
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
    }
}
