public class InvalidPhoneNumber extends Exception {
    // Constructor
    public InvalidPhoneNumber() {
        super("Invalid input, PhoneNumber must have 10 characters and start with 0");
    }
}