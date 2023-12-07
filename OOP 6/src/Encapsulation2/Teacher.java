package Encapsulation2;

// extends for re-use parent class .
public class Teacher extends Person{

    String graduation;

    public void  displayinformation2() {
        displayinformation1();
        System.out.println("GRADUATE: "+graduation);
    }
}
