package Polymorphism;

public class Test {
    public static void main(String[] args) {

        Student ob = new Student("Hossain",380);
        ob.display();


        //difference type
        // Teacher ob1=new Teacher  or
        // Student ob1=new Teacher or
        //super class object=subclass reference
        ob = new Teacher("hell",380,"Denvar");
        //How use refer ?
        ob.display();


    }
}
