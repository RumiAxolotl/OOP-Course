/**
 This class defines a person by name and address.
 */
public class Person {
    private String lastName; // The person's last name
    private String firstName; // The person's first name
    private Address home; // The person's address

    /**
     Constructor
     @param last The person's last name.
     @param first The person's first name.
     @param residence The person's address.
     */

    public Person() {}

    public Person(String last, String first, Address residence) {
        this.lastName = last;
        this.firstName = first;
        this.home = residence;
    }

    /**
     The toString method
     @return Information about the person.
     */

    public String toString() {
        return(firstName + " " + lastName + ", " + home.toString());
    }
}
