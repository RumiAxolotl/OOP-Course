abstract class PersonClass {
    private String name;
    private String address;

    public PersonClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void display();
}

public class Person {
    public static void main(String[] args) {
        PersonClass person1 = new EmployeeClass("Trung", "HN", 3300);
        PersonClass person2 = new CustomerClass("Linh", "BN", 10400);
        person1.display();
        person2.display();
    }
}

