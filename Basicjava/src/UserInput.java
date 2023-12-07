import java.util.Scanner;

//Assignment-03 From Anisur Rahman
public class UserInput {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your id :");
        int id;
        id= input.nextInt();
        input.nextLine(); //why use?


        System.out.println("Enter your Title :");
        String title;
        title= input.nextLine();

        System.out.println("Enter your price :");
        double price;
        price= input.nextDouble();
        input.nextLine(); // why use?

        System.out.println("Enter your Description :");
        String description;
        description= input.nextLine();

        System.out.println("Enter your Category :");
        String category;
        category= input.nextLine();


        System.out.println("MY id is "+id);
        System.out.println("My group title is "+ title);
        System.out.println("My product price is "+  price);
        System.out.println("My product description is "+ description);
        System.out.println("My product category is "+ category);
    }
}
