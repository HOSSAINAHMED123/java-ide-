package PolymorphismPractise;

public class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double area(){
        System.out.print("The Triangle area is: ");
        return 0.5*base*height;
    }

}
