class ATM {
    public void withdraw(int amount) {
        System.out.println("Withdrawn: $" + amount);
    }
    public void withdraw(int amount, String accountType) {
        System.out.println("Withdrawn $" + amount + " from " + accountType + " account.");
    }
    public void withdraw(int amount, String accountType, String accountNumber) {
        System.out.println("Withdrawn $" + amount + " from account number: " + accountNumber + " (" + accountType + ").");
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw(100);
        atm.withdraw(200, "Savings");
        atm.withdraw(500, "Checking", "123456789");
    }
}
