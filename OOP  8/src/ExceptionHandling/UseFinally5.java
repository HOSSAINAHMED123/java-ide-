package ExceptionHandling;

public class UseFinally5 {
    public static void main(String[] args) {

        /*
           * When I will Find Exception or Not But I want Next Line obviously print
           *  than use "Finally"
         */
        try {
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println("RESULT: "+result);
        }catch (AbstractMethodError E){                 //This is Arithmetic but i Assume this is Abstract type.
            System.out.println("Exception Show: "+E);
        }
        finally {
            System.out.println("Last Line of the Programm");
        }
    }
}
