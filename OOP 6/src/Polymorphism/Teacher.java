package Polymorphism;

public class Teacher extends Student {
    String system;

    Teacher(String name,int id,String system){
        super(name,id);
        this.system=system;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Refer: "+system);
    }

}
