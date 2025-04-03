abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Checking Account.");
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew $" + amount + " from Checking Account.");
    }
}

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new CheckingAccount("123456", 1000);
        account.deposit(500);
        account.withdraw(200);
    }
}
