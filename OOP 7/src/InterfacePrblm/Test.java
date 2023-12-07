package InterfacePrblm;
/*
    * you can use object from subclass
      Note: (Abstract Class not Create object)
    * Same of Interface
 */
public class Test {
    public static void main(String[] args) {

        //sub class object
        Dog ob = new Dog();
        ob.eat();

        Cat ob1=new Cat();
        ob1.eat();
    }
}
