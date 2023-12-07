package PolymorphismPractise;

public class Test {
    public static void main(String[] args) {

        /*
        Shape S1=new Shape();
        Shape S2=new Rectangle(10,5);
        Shape S3=new Triangle(11,9);


        System.out.println("SHAPE :"+ S1.area());
        System.out.println("RECTANGLE :"+ S2.area());
        System.out.println("TRIANGLE :"+ S3.area());
        */
        //or declare of array-
         Shape[] S=new Shape[3];
         S[0]=new Shape();
         S[1]=new Rectangle(10,5);
         S[2]=new Triangle(11,9);

         //loop for print call-

        for (int i=0; i<3; i++){
            System.out.println(S[i].area());
        }
    }
}
