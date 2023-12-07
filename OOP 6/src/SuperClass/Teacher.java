package SuperClass;

//This is Super class Method
public class Teacher extends Person {

    @Override
    void display(){
        super.display();
        System.out.println("print teacher");
    }
}
