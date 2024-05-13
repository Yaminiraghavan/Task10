public class Account {
    private double balance;
    public Account() {
        balance = 0.0;
    }
    public Account(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.deposit(1000);
        System.out.println("Current balance of account1: " + account1.getBalance());
        account1.withdraw(500);
        account1.withdraw(700);

        Account account2 = new Account(2000);
        System.out.println("Current balance of account2: " + account2.getBalance());
        account2.deposit(500);
    }
}
