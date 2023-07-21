

//Extend the account class to create a new subclass called CAccount for modelling a checking account
public class CAccount extends Account {
    private double overdraftLimit;
    private double amountOverdrawn;

    public CAccount(String name, String ID, double balance, double overdraftLimit, double amountOverdrawn) {
        super(name, ID, balance);
        this.overdraftLimit = overdraftLimit;
        this.amountOverdrawn = amountOverdrawn;
    }


    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getAmountOverdrawn() {
        return amountOverdrawn;
    }

    public void setAmountOverdrawn(double amountOverdrawn) {
        this.amountOverdrawn = amountOverdrawn;
    }

    @Override
    //the overdraft should not be used unless the current balance is insufficient to cover the withdrawal.
    public void withdraw(double amt) {
        if (amt > balance) {
            if (amt - balance > overdraftLimit) {
                System.out.println("Insufficient balance");
            } else {
                amountOverdrawn += amt - balance;
                balance = 0;
            }
        } else {
            balance -= amt;
        }
    }

    @Override
    public void deposit(double amt) {
        if (amt > amountOverdrawn) {
            balance += amt - amountOverdrawn;
            amountOverdrawn = 0;
        } else {
            amountOverdrawn -= amt;
        }
    }
    //checking accounts can use an overdraft facility, so the new class will need instance variables for the overdraft limit and the amount overdrawn.
    public double getBalance() {
        return balance - amountOverdrawn;
    }
}


//The overdraft limit is the maximum amount that can be overdrawn, and the amount overdrawn is the current amount that the account is overdrawn.
