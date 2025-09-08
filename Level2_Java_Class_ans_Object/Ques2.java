class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited successfully.");
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Komal Patel", "ACC123", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}
