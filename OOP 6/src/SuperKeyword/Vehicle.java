package SuperKeyword;

public class Vehicle {
    String color;
    int weight;

    //constructor
    Vehicle(String C,int W){
        color=C;
        weight=W;
    }
    //print method
    void display(){
        System.out.println("COLOR: "+color);
        System.out.println("WEIGHT: "+weight);
    }

}
