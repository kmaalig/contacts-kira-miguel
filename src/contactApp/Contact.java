public class Contact {
    // Private variables for contact item
    private String name;
    private String phoneNum;

    // Constructor for contact variables
    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    // Create contact item from string
    public static Contact fromString(String contactString) {
        String [] parts = contactString.split("-");
        return new Contact();
    }

    // Set String format for contact information
    @Override
    public String toString() {
        return name + ":" + quantity;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}