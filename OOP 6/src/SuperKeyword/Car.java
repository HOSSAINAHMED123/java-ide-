package SuperKeyword;
//inherit from Vehicle
public class Car extends Vehicle{

    String gear;
    String model;
//Constructor and super class
    Car(String C,int W,String G,String M){
        super(C,W);
        gear=G;
        model=M;
    }
//method override and print
    @Override
    void display() {
        super.display();
        System.out.println("GEAR: "+gear);
        System.out.println("MODEL: "+model);
    }
}
