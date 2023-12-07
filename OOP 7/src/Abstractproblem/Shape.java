package Abstractproblem;

//abstract class
public abstract class Shape {

    //instance
    double base;
    double height;

    //constructor
    Shape(double base,double height){
        this.base=base;
        this.height=height;
    }
    //abstract method
    public abstract void area();
}
