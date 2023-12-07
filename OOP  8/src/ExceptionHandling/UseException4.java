package ExceptionHandling;

public class UseException4 {
    public static void main(String[] args) {

        /*
         * When you are not Find Whose line are Error Than you use "Exception"  Object Because
         * All Exception Type Are Include Between Exception.
         */

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("RESULT: " + result);
        } catch (AbstractMethodError E1) {                    //1st use Sub Class of Exception
            System.out.println("Exception Show: " + E1);
        }catch (ArrayIndexOutOfBoundsException E2){           //1st use Sub Class of Exception
            System.out.println("Exception Show: "+E2);
        }catch (NullPointerException E3){                     //1st use Sub Class of Exception
            System.out.println("Exception Show: "+E3);
        }catch (Exception E){                           // This is Super most Exception ,That is use always lastly
            System.out.println("Exception Show: "+E);
        }

        System.out.println("Last Line of the Program");
    }
}
