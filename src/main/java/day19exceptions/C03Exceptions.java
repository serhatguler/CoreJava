package day19exceptions;

public class C03Exceptions {
    /*
        StringIndexOutOfBoundsException: String index out of range: 5
        cpntrol +alt +t try catch kisa yoludur.
     */
    public static void main(String[] args) {

        String s ="java";

        getCharFromString(s,2);
        getCharFromString(s,5);

    }

    public static void getCharFromString(String s, int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index hatasi : "+e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("catch block ici printstacktrace metodu sonrasi");
        }
    }
}
