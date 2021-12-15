public class SavingsAccount extends BankAccount{
    private static double rate = 0.025;
    private int savingsNumber;
    private String accountNumber;

    SavingsAccount(String name, double amount) {
        super(name, amount);
    }

    SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
    }

    public void postInterest () {
       double temp = super.getBalance();
       temp = temp + temp*rate;
       super.setBalance(temp);
    }

    @Override
    public String getAccountNumber() {
        accountNumber = super.getAccountNumber();
        return accountNumber;
    }
}
