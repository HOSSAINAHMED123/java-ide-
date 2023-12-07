package SuperKeyword;
//inherit from car
public class Cycle extends Car{

    int kilometer;
//constructor and super class
    Cycle(String C,int W,String G,String M,int K){
        super(C,W,G,M);
        kilometer=K;
    }
//Again method override
    @Override
    void display() {
        super.display();
        System.out.println("KILO: "+kilometer);
    }
}
