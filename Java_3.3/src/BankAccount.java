public class BankAccount {
    private double accountBalance;
    private int accountNumber;
    private static int totalAccounts;

    public BankAccount(double accountBalance){
        this.accountBalance = Math.min(0,accountBalance);
        totalAccounts++;
        this.accountNumber = totalAccounts;

    }
    public void deposit(double amount){
        if(amount > 0){
            accountBalance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && accountBalance >= amount){
            accountBalance -= amount;
        }
    }

    public double getBalance(){
        return accountBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    // Your variable declarations and code here

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}