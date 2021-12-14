public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public String getPersonals()  {
        return String.format("%s", getOwner());
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalnace(Money balance) {
        this.balance = balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Money creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


    public void charge(Money temp) {
        if(balance.add(temp).getDollars() <= creditLimit.getDollars()) {
            System.out.println("Charge: " + temp);
            balance = balance.add(temp);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money temp) {
        balance = balance.subtract(temp);
    }
}
