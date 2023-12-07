/*
   * Assignment-04
   * Enter the input from user
   * mobile phone installment  system
   * per monthly installment count
 */

import java.util.Scanner;

public class OperatorType {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int phone_price,number_of_installment,per_month_installment;
        System.out.print("phone price input: ");
        phone_price=input.nextInt();

        System.out.print("number of installment input: ");
        number_of_installment=input.nextInt();

        per_month_installment=phone_price/number_of_installment;
        System.out.println("Installment per price: "+per_month_installment);
    }

}
