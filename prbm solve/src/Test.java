public class Test {
    public static void main(String[] args) {
        Account ac1=new Account("habib",100);
        Account ac2=new Account("Ahmed",200);

        System.out.println(ac1.name + " " + ac1.b);
        System.out.println(ac2.name + " " + ac2.b);

        ac1.diposit(130);
        ac1.withdraw(20);
        System.out.println(ac1.b + " "+ ac2.b);

        ac2.diposit(500);
        ac1.withdraw(30);
        System.out.println(ac1.b + " "+ ac2.b);
    }
}
