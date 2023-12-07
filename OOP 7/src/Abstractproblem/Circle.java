package Abstractproblem;

public class Circle extends Shape {

    //constructor
    Circle(double radious){
        super(radious,radious);
    }
    @Override
    public void area(){
        double result3= 3.1415*base*height;
        System.out.println("Circle area: "+result3);
    }
}
