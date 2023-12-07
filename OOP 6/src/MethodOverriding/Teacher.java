package MethodOverriding;

public class Teacher extends Person {
    String grade;
    @Override
     void displayinformation(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("GRADE: "+grade);
    }
}
