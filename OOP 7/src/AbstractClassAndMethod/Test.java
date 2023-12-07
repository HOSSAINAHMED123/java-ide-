package AbstractClassAndMethod;

public class Test {
    public static void main(String[] args) {

        //you cannot use object for Abstract but use reference variable
        User ob;
        //now, you can use object for reference;
        ob= new Karim();
        ob.message1();
        ob.message();

        ob= new Rahim();
        ob.message1();
        ob.message();
    }
}
