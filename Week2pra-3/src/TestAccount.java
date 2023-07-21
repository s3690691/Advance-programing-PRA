public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("Tan A K","S123",24.5);
        Account a2 = new Account("Smith T","S124",1200.0);
        //set the overdraft limit to 100 and the account overdrawn to 0
        CAccount a3 = new CAccount("Louis","S125",50,100,0);
        //a4 is a checking account with an overdraft limit of 100 and an amount overdrawn of 50
        CAccount a4 = new CAccount("Ben","S126",50,100,0);

        a1.deposit(100);
        a1.withdraw(2000);
        a2.deposit(120);
        a2.withdraw(80);
        System.out.println("Balance for " + a1.name + " is " + a1.getBalance());
        System.out.println("Balance for " + a2.name + " is " + a2.getBalance());


        a3.deposit(100);
        a3.withdraw(2000);
        System.out.println("Balance for " + a3.name + " is " + a3.getBalance());

        a4.deposit(100);
        a4.withdraw(20);
        System.out.println("Balance for " + a4.name + " is " + a4.getBalance());
    }
}

