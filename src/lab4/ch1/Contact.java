package lab4.ch1;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Phone number of : " + name + " is " + phoneNumber;
    }

    public String getName() {
        return name;
    }
}
