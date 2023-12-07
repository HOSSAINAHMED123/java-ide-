/*
    *Final Keyword-Fixed Initialization
     -do not Modify Variable access;
    * Blank Final Variable-Not Initialization Variable
      -When need Initialization than use Constructor;
    * Static Block Final Variable;
      -When need Initialization than use Static Block
 */


package FinalKeyword;

public class Person {

    final String University="UIU"; //Rule one
    final int Id; //Rule Two

    static final int age;  //Rule Three;

    //Constructor for Blank Final Variable;
    Person(){
        Id=1200;
    }
    // Static Block for Static Blank Final Variable
    static{
        age=25;
    }

    //method print
    void display(){
        System.out.println("UNIVERSITY: "+University);
        System.out.println("ID: "+Id);
        System.out.println("AGE: "+age);
    }

}
