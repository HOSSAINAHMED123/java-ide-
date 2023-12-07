public class Rectangle {
    //instance
    double width;
   double height;

   //class
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    //Empty Constructor
Rectangle(){

}

//Method
   double getArea(){

        return width*height;
    }
    double getPerimeter()
    {
        return 2*(width+height);
    }


}
