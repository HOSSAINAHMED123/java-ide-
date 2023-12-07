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
/*
    *Now, How to Create Overloading Constructor
    * Overloading is Use Multiple Constructor Create
    - But Not Use Same Parameter
    * Always use different types parameter But Constructor
    - name Always followed by Class
 */

//This is Class
public class Teacher {
    String name,gander;
    int phone;

    //Use First Default Constructor For Overloading-01
    Teacher(){
        System.out.println("No information");
    }
    //Use Second parameter Constructor For Overloading-02
    Teacher(String m,String n){
        name =m;
        gander =n;
    }
    //Use Third parameter Constructor For Overloading-03
    Teacher(String m,String n,int p){
        name =m;
        gander =n;
        phone =p;
    }
    //This is print Method
    void displayinformation(){
        System.out.println("NAME :"+name);
        System.out.println("GANDER :"+gander);
        System.out.println("PHONE :"+phone);

        System.out.println("\n");
    }
}
