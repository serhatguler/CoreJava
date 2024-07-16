package day18oop_static_keyword;

/*  What is the difference between being Static and nonstatic?
    1) Static class members are shared by all objects.
       Nonstatic class members are shared by all objects, they are specific for the objects

    2) Updates on Static class members are visible by all objects automatically.
       Updates on Nonstatic class members aren't visible by all objects automatically, to make it visible it for other you need to type some codes

    3) To access Static class members just class name is enough ,but
       To access Nonstatic class members you have to create object.

    4) Static class members are created together with the class
       Nonstatic class members are created when you create an object.

    5) Static class members are created just once, but
       Nonstatic class members are created in every object creation.
 */

public class C06Student {

    public  static int numOfStdCreated = 0; //class variable and static variable are synonym
    public int numOfEyes = 0;

    public C06Student() {
        numOfEyes = numOfEyes+2;
        numOfStdCreated++;
    }
}
