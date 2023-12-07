/*
    *This is poly or multiple type
    * 01) Compile time/static
    exm: Method Overloading -already code done previous
         - perimeter difference but use multiple method are same
         and Constructor overloading -already code done previous
    * 02) Run time/dynamic poly
    exm: Method Overriding - already code done previous
            *Just difference*
        - Super class object create and use sub-class reference
 */

package Polymorphism;

public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name=name;
        this.id=id;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
