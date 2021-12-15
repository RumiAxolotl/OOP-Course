/**
 The BankAccount class is an abstract class that holds
 general data about a bank account. Classes representing
 specific types of bank accounts should inherit from
 this class.
 */

public abstract class BankAccount {
    private double balance; // Current balance in the account
    private String owner; // Name on the account
    private String accountNumber; // Number bank uses to identify account
    protected static int numberOfAccounts = 1001; // Class variable so that each account has a unique number

    /**
     * Default constructor
     */

    public BankAccount() {
        balance = 0;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    /**
     * Standard constructor
     * @param name   The owner of the account.
     * @param amount The beginning balance.
     */

    public BankAccount(String name, double amount) {
        this.owner = name;
        this.balance = amount;
        this.accountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    /**
     * Copy constructor creates another account for the same owner.
     * @param oldAccount The account with information to copy.
     * @param amount     The beginning balance of the new account.
     */

    public BankAccount(BankAccount oldAccount, double amount) {
        owner = oldAccount.owner;
        balance = amount;
        accountNumber = oldAccount.accountNumber;
    }

    /**
     * Allows you to add money to the account.
     * @param amount The amount to deposit in the account.
     */

    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Allows you to remove money from the account if
     * enough money is available, returns true if the
     * transaction was completed, returns false if
     * there was not enough money.
     *
     * @param amount The amount to withdraw from the account.
     * @return True if there was sufficient funds to
     * complete the transaction, false otherwise.
     */

    public boolean withdraw(double amount) {
        boolean completed = true;
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            completed = false;
        }
        return completed;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

}
