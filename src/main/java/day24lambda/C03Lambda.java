package day24lambda;

import java.util.stream.IntStream;

public class C03Lambda {
    public static void main(String[] args) {

        System.out.println(getSum(7, 1));
        System.out.println(getFactorial(5));


    }
    //Example1: Create method to find the sum of integers from 7 to 100
    public static int getSum(int starting, int ending){
        if (starting>ending){ // if ending value is bigger than starting value
            int temporary = starting;
            starting = ending;
            ending =temporary;
        }
        return IntStream.rangeClosed(starting,ending).sum();
    }

    //Example2: Create method to find the factorial of a given number
    public static  int getFactorial(int e ){

        if (e<0){
            System.out.println("negative numbers can not be used in factorial operation");
        }
        //return IntStream.rangeClosed(1,e).reduce(1,(t,u)->t*u);
        return IntStream.rangeClosed(1,e).reduce(Math::multiplyExact).getAsInt();
    }
    /*
        Lambda Expression: Variable(s) -> Operations --> (t,u) -> t*u
        Method Reference: Classname :: Methodname without parenthesis  ->> Math::multiplyExact
     */
}
