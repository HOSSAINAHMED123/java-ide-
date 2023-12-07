public class Account {
    String name;
    double b;

    Account(String name,double b){
        this.name=name;
        this.b=b;
    }
    void diposit(double amount){
        b +=amount;
    }
    void withdraw(double amount){
        if(amount <= b){
            b-=amount;
        }
    }
}
