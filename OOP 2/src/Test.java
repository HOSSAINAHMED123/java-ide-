//Another Class
public class Test {
    //Main class
    public static void main(String[] args) {

        //Use Object and Initial value from Constructor
        Teacher Teacher1=new Teacher("Hossain","Male",172549056);
        //Use print Method
        Teacher1.displayinformation();

        //Use Another Object and Initial value from Constructor
        Teacher Teacher2=new Teacher("Maheen","Male",172588795);
        //Use print Method
        Teacher2.displayinformation();

        //Use Another Object for default Parameter Constructor
        Teacher Teacher3=new Teacher();
        //Use print Method
        Teacher3.displayinformation();
    }
}
