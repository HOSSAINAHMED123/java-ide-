package PolymorphismPractise;

public class Rectangle extends Shape{
    double width;
    double length;

    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    @Override
    public double area(){
        System.out.print("The Rectangle area is: ");
        return width*length;
    }

}
