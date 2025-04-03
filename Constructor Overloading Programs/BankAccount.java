class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String accountType;
 
    public BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
        this.accountType = "Savings";
    }
 
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 100.0; // Default initial balance
        this.accountType = "Savings";
    }
 
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = "Savings";
    }
 
    public BankAccount(String accountHolder, String accountNumber, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
 
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
    }
 
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Alice", "123456");
        BankAccount acc3 = new BankAccount("Bob", "987654", 5000);
        BankAccount acc4 = new BankAccount("Charlie", "789123", 10000, "Current");
 
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        acc3.displayAccountInfo();
        acc4.displayAccountInfo();
    }
}
