package onlineStore;

public class WrongPassword extends Exception{
    public WrongPassword(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPassword{} " + super.toString();
    }
}
