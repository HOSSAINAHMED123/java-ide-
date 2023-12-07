package ExceptionHandling;

public class UseTryCatch3 {
    public static void main(String[] args) {

        /*
             *Error Exception Handle
             * When Exception Handle line-09 ; Success than work Next Line: 10 to last line
             * Exception manage with FIVE keyword
             * 01) try ; 02) catch ; 03) finally ; 04) throw ; 05) throws
             *  06) extra: Custom Exception ;
         */

        try{
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println("RESULT: "+result);
        }catch (ArithmeticException E){  //When You use Another object like "Null pointer Exception"  this is not work.
            System.out.println("Exception Show: "+E);
        }

        System.out.println("Last Line of the Programm");
    }
}
