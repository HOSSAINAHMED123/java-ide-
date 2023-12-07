public class Main {
    public static void main(String[] args) {

        //Rectangle Object
        Rectangle rectangle=new Rectangle(5,4);
        //1st way
        double rectArea=rectangle.getArea();
        //or System.out.println("Area : "+ rectangle.getarea());

        //2nd way
        double rectParameter=rectangle.getPerimeter();
        //or System.out.println("Perimeter : "+ rectangle.getperimeter());

        System.out.println("Rectanguler area: "+rectArea+" parameter: "+rectParameter);


        //Square Object same way from Rectangle
        Square square=new Square(5);
        double squareArea= square.getArea();
        double squareParameter=square.getPerimeter();
        System.out.println("Square area: "+squareArea+" parameter: "+squareParameter);

        //Circle Object
        Circle circle=new Circle(6);

        System.out.println("Circle area: "+circle.getArea()+" parameter: "+circle.getPerimeter());



    }
}
