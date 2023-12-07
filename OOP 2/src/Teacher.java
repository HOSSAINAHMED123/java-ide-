/*
    This is OOP 1 project just customize and
    add Constructor...........
    *How to use Constructor
        1. Special method; No need Inside Call ;
        2. This is Auto Call Type;
        3. No need Return Type / Void Type;
        4. This is Object Initialization Method;
        5. Constructor NAME Followed By CLASS;
    * Two Types of Constructor
        1. Parameter type
        2. Default Parameter type
 */

public class Teacher {
    String Name,Gander;
    int Phone;

    //How to use default Parameter Type Constructor
    Teacher(){

        System.out.println("No Value");
    }

    //How to use Parameter Type Constructor
    Teacher(String m,String n,int p){
        Name = m;
        Gander = n;
        Phone = p;
    }
    //Use print Method
    void displayinformation(){
        System.out.println("NAME : "+Name);
        System.out.println("GANDER : "+Gander);
        System.out.println("PHONE : "+Phone);

        System.out.println("\n");
    }


}
