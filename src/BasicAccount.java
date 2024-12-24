public class BasicAccount implements IAccount {
    private int accountNumber;
    private double balance;
    private double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            balance -= amount;
            return amount;
        }
        return 0;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
