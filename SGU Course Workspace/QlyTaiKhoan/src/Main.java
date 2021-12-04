import java.util.Date;

public class Main {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        Account acc = new Account(1112, 20000, 0.045);

        System.out.println("id: " + acc.getId());
        System.out.println("balance: " + acc.getBalance());
        System.out.println("Interest Rate: " + acc.getAnnualInterestRate());

        acc.withdraw(2000);
        System.out.println("balance now: " + acc.getBalance());
        acc.deposit(10000);
        System.out.println("balance now: " + acc.getBalance());


    }
}
