package practices_dt;

public class Q01_Variables {
    public static void main(String[] args) {

        /*
        Task: Write a Java programme to break an integer into a sequence of individual digits.
Hint: use / and %
x: input: 12345
output: 1
              2
              3
              4
              5
         */

        int x = 12345; // 12345% => 1234.5
        int ones = x%10;
        int tens = (x/10)%10; // 12345=>1234.5
        int hundres = (x/100)%10; // 12345=>123.45
        int thousands = (x/1000)%10; // 12345=>12.345
        int tenThousands = (x/10000)%10; // 12345=>1.2345

        System.out.println(tenThousands +"\n"+ thousands +"\n"+ hundres +"\n"+ tens +"\n"+ ones); // '\n' alt alta yazdirir.







    }
}
