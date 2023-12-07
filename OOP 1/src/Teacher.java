/*
    * Create Class for use Multiple time Object clone
    * Create Class for How to use Another Method in Class

    * This Code is Read Complete ? Now, Follow OOP 2 project
    * That is next part from OOP 1
 */

public class Teacher {

       //This is Class variable
       String name,gander;
       int phone;

       //This is Class Method use for information
       void setinformation(String m,String n,int p){

              name = m;
              gander = n;
              phone = p;
       }

       //This is Class Method for print
       void displayinformation() {
              System.out.println("Name :"+name);
              System.out.println("Gander :"+gander);
              System.out.println("Phone number :"+phone);
              System.out.println("\n"); //New Line space for Another Object
       }
}
