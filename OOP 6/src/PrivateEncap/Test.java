package PrivateEncap;

public class Test {
    public static void main(String[] args) {

        Teacher teacher=new Teacher();

        teacher.setName("Hossain");
        System.out.println("TEACHER: "+teacher.getName());

        teacher.setAge(32);
        System.out.println("AGE: "+teacher.getAge());

        teacher.setGraduate("BA_2023");
        System.out.println("GRADUATE: "+teacher.getGraduate());
    }
}
