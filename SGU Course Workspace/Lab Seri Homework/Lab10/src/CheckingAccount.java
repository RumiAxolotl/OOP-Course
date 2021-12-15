public class CheckingAccount extends BankAccount{
    private static double FEE = 15;

    CheckingAccount(String name, double amount) {
        super(name, amount);
    }

    @Override
    public boolean withdraw(double amount) {
        boolean checkVal = true;
        if(amount <= super.getBalance()) {
            double balance = super.getBalance() - amount;
            super.setBalance(balance);
        }else {
            checkVal = false;
        }
        return checkVal;
    }
}
