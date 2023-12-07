//This is Another Class
public class Test {

    //This is Main Class
    public static void main(String[] args) {

    //This is Create Object
        Teacher Teacher1; //Declare object
        Teacher1=new Teacher(); //Create Object Teacher1

        /*
          or
          Teacher Teacher1=new Teacher(); //Declare and Create Object

         */

        //Called From set information and use Method
        Teacher1.setinformation("Easin PAtwary","Male",1874555332);

        //Or called for Set info.
/*
        Teacher1.name="Easin PAtwary";
        Teacher1.gander="Male";
        Teacher1.phone=1874555332;

 */
    //This is print Method
        Teacher1.displayinformation();

    //or Another print
        /*
        System.out.println("Name :"+Teacher1.name);
        System.out.println("Gander :"+Teacher1.gander);
        System.out.println("Phone number :"+Teacher1.phone);
        */

        //Create Another Object
        Teacher Teacher2=new Teacher();

        //Called from set information
        Teacher2.setinformation("Hossain Ahmed","Male",1874575032);

    // or set Another info.
/*
        Teacher2.name="Hossain Ahmed";
        Teacher2.gander="Male";
        Teacher2.phone=1874575032;

 */
    //This is print Method
        Teacher2.displayinformation();

    // or Another print
        /*
        System.out.println("Name :"+Teacher2.name);
        System.out.println("Gander :"+Teacher2.gander);
        System.out.println("Phone number :"+Teacher2.phone);
         */

    }

}
