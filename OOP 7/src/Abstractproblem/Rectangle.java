package Abstractproblem;

public class Rectangle extends Shape {

    //constructor
    Rectangle(double base,double height){
        super(base, height);
    }
 @Override
 public void area(){
     double result2= base*height;
     System.out.println("Rectangle area: "+result2);
 }
}
