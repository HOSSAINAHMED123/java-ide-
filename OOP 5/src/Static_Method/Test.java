package Static_Method;

public class Test {
    public static void main(String[] args) {

        //object for non-static
        StaticMethod S1=new StaticMethod();
        S1.display1();

        //object not need for static call
        StaticMethod.display2();
    }
}
