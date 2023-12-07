package Abstractproblem;

public class Triangle extends Shape {

    //constructor
    Triangle(double base,double height){
        super(base, height);
    }
    //must be override type
    @Override
    public void area(){
        double result1= 0.5*base*height;
        System.out.println("Triangle area: "+result1);
    }
}
