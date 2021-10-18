class CustomerClass extends PersonClass {
    private int balance;

    public CustomerClass(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display(){
        System.out.println("Customer Name: " + super.getName());
        System.out.println("Customer Address: " + super.getAddress());
        System.out.println("Customer Balance: " + balance);
    }
}