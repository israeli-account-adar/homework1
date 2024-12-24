public class PremiumAccount implements IAccount {
    private int accountNumber;
    private double balance;

    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
