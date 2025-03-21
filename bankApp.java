class BankAccount{
    protected double balance;


    public BankAccount(double balance){
        this.balance=balance;
    }
     public void deposit(double amount){
        balance+=amount;
     }


     public  abstract void withdraw(double amount);
        
}

class SavingsAccount extends BankAccount{
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal denied! Balance must remain at least $100.");
        }
    }
}




class CheckAccount extends BankAccount{
    private double fee;

    public CheckAccount(double balance, double fee){
        super(balance);
        this.fee=fee;
    }

    public void deductFee(){
        balance-=fee;
    }
}