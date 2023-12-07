package Abstractproblem;

public class Test {

    public static void main(String[] args) {

        //cannot use object but use reference variable
        Shape shape;
        //object
        shape=new Triangle(10,20);
        shape.area();


        //object
        shape=new Rectangle(5,10);
        shape.area();

        //object
        shape=new Circle(5);
        shape.area();
    }
}
