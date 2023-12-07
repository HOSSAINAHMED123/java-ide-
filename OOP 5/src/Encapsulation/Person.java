/*
    * Encapsulation use for private uses.
    * Its can be modify code without breaking
    * Code maintain easy
    --------------------------------
    * private access for use setter and getter
    * Setter use private to public way path
    * Getter use for access private
 */

package Encapsulation;
//Class
public class Person {
    //Instance
    private String name;
    private int age;

    //public setter method for access
    //No return type
    public void SetName(String name, int age){
        //Instance.Local=name/age
        this.name=name;
        this.age=age;
    }
    //public getter method for return
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
