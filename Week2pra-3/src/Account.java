public class Account {
    String name;
    private String ID;
    public double balance;

    public Account(String name, String ID, double balance){
        this.name =name;
        this.ID= ID;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void withdraw(double amt){
         if (amt > balance) {
             System.out.println("Insufficient balance");
             return;
         }
        balance -= amt;
    }


    public void deposit(double amt){
        balance += amt;
    }
}


