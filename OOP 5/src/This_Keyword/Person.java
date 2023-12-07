package This_Keyword;
//Class
public class Person {
    //Variable / Instance
    String name;
    int age;
    String Haircut;

    //Constructor
    //(Local instance)
    Person(String name, int age){
        this.name=name;
        this.age=age;

    }
    //2nd Constructor
    Person(String name, int age, String Haircut){
        //this.name=name;
        //this.age=age;
        this(name, age);
        this.Haircut=Haircut;
    }
    void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("HAIRCUT: "+Haircut);
    }
}
