public class Square extends Rectangle {
    double length;

    //Empty Constructor
    Square (){

    }

    //Method
    /*
        * Super class use for Extend Who . And reuse their Method Function
        * Because of Extra line not uses. just Super class  use for her access.
     */
    Square(double length){

        //Super use for main class access.
        super(length,length);
        this.length=length;
    }


}

