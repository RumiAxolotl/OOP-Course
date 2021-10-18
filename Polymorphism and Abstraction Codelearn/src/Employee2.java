public abstract class Employee2 implements IEmployeeInterface{
    private String name;
    private int paymentPerHour;

    public Employee2(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}
