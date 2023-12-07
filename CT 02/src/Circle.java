public class Circle extends Square{
    //Instance
    double radius;

    //Class
    Circle(double radius)
    {
        //super use for main class access.|| Circle==Square==Rectangle. ||
        super(radius);
        this.radius=radius;
    }

    @Override
    double getArea() {

        return radius*radius*3.1415;
    }

    @Override
    double getPerimeter() {
        return 2*radius*3.1415;
    }
}
