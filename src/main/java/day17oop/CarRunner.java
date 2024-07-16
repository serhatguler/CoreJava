package day17oop;

public class CarRunner {
    public static void main(String[] args) {

        Honda myHonda = new Honda();
        myHonda.price();//Price() method is a concrete method in interface and it is created by "default" keyword
                        //That kind of methods are called DEFAULT METHODS
                        //"default methods" are accessible by using object

        Engine.accelerate();//accelerate  method is a concrete method in interface and it is created by "static" keyword
                            //That kind of methods are called STATIC METHODS
                            //"Static methods" are accessible by interface name

        System.out.println(Engine.ENGINE_NAME);//Electrical Engine


    }
}
