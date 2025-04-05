package mypackage.bank;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

import mypackage.bank.BankAccount;

public class MainBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John Doe", 1000);
        acc.showBalance();
        acc.deposit(500);
        acc.withdraw(300);
        acc.showBalance();
    }
}
