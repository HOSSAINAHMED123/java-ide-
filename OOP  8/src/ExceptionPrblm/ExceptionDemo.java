package ExceptionPrblm;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        while (true){
            try{
                //Scan
                Scanner input=new Scanner(System.in);
                System.out.println("Please Enter num1: ");
                int num1=input.nextInt();                    //input from scanner
                System.out.println("Please Enter num2: ");
                int num2=input.nextInt();                    //input from scanner

                int result=num1/num2;                        //Show result
                System.out.println("Result: "+ num1 + "/" + num2 + "=" +result);

            }catch (Exception e){
                System.out.println("Exception: "+e);
                System.out.println("You Must Enter Integer. Please Try Again. ");
            }
        }
    }
}
