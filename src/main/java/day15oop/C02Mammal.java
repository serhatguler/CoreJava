package day15oop;

public class C02Mammal extends C01Animal {

    public String type;
    public int height;
    public int weight = 10;

   public C02Mammal(){

       System.out.println("No Parameter2");
   }

   public C02Mammal(String type, int height){

       System.out.println("Type and height parameters");
   }
    public void eat(){
        System.out.println("Mammals eat...");
    }




}
