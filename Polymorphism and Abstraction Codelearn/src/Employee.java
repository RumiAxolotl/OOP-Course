class EmployeeClass extends PersonClass {
    private int salary;

    public EmployeeClass(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee Name: " + super.getName());
        System.out.println("Employee Address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
