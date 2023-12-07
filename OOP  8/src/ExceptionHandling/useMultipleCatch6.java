package ExceptionHandling;

public class useMultipleCatch6 {
    public static void main(String[] args) {

       /*
           * use Multiple Catch For Exception Handling
        */
        try {
            int[] a=new int[4];
            a[4]=5;

        }catch (ArrayIndexOutOfBoundsException E1){
            System.out.println("Exception Show 1 :"+E1);
        }catch (ArithmeticException E2){
            System.out.println("Exception Show 2 :"+E2);
        }

        System.out.println("Last Line of the Program");
    }
}
