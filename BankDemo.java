// Base class BankAccount
abstract class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Abstract withdraw method
    public abstract void withdraw(double amount);

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

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

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - (amount + TRANSACTION_FEE) >= 0) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn: $" + amount + " (Fee: $" + TRANSACTION_FEE + ")");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// Main class to demonstrate functionality
public class BankDemo {
    public static void main(String[] args) {
        // Create SavingsAccount and CheckingAccount objects
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(300);

        // Perform transactions
        System.out.println("Savings Account:");
        savings.deposit(200);
        savings.withdraw(550);
        savings.withdraw(200);
        savings.displayBalance();

        System.out.println("\nChecking Account:");
        checking.deposit(100);
        checking.withdraw(50);
        checking.withdraw(400);
        checking.displayBalance();
    }
}
