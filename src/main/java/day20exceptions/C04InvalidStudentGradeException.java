package day20exceptions;

public class C04InvalidStudentGradeException extends Exception{

    public C04InvalidStudentGradeException(String message) {
        super(message);
    }
    /*
        1-Custom Exception Class olusturmak icin Exception classa extends etmeliyiz
          Exception classa extend ederek olusturdugumuz Custom Exception Class Compile Time Exception olur.
          Eger RunTime Exception olusturmak istiyorsak  RunTime Exception a ectend etmeliyiz

        2- Custom Exception Class olustururuken constructor olusturarak mesaj verebilirz.

        3- -Custom Exception Class olusturdugumuzda ismin sonuna Exception kelimesini ekleriz
     */
}
