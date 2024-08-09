package day20exceptions;

public class ExceptionRunner {
    /*
        Error diye adlandirdigimiz ve handle edilemeyen problemler vardir.
        stack memory dolarsa : StackOverFlow Error
        heap memory dolarsa outofmemory error aliriz.

        finalize: Garbage collector memory i temiz tutmak icin silinmesi gereknleri siler. Garbage collector
        silmeden once silecegi datalari finalize yapar sonra siler
        yani garbage Collector sadece finalized yapilmis objeleri toplar ve yok eder.
     */

    public static void main(String[] args) {

        getStudentGrade(115);


    }

    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new C04InvalidStudentGradeException("Student's grade cannot be less than 0 or grater than 100");
            } catch (C04InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }
    }
}
