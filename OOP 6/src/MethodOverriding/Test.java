package MethodOverriding;

public class Test {
    public static void main(String[] args) {

        //1st Subclass info set-
        Teacher teacher=new Teacher();
        teacher.name="Hossain";
        teacher.age=21;
        teacher.grade="DU-2021";
        teacher.displayinformation();

        //2nd Superclass info set-
        System.out.println("\n");
        Person person=new Person();
        person.name="Habib";
        person.age=22;
        person.displayinformation();
    }
}
