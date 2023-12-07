import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        //How to input and print-01
/*
        int number=100;
        System.out.println(number);
 */

        //How to input and print another way-02
        /*
        int number=100;
        System.out.println("Number="+number);
         */

        // How to input from user and print-03
/*
        Scanner input =new Scanner(System.in); //location set top of code
        int number;
        System.out.print("Enter Any Number :");

        number= input.nextInt();
        System.out.println("Number ="+number);
 */

        //How to input string -01
        /*
        String name="Hossain Ahmed";
        System.out.println("My Name is "+name);
 */
        //How to input String from user
        Scanner input=new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name=input.nextLine();
        System.out.println("My name is "+name);



    }
}
