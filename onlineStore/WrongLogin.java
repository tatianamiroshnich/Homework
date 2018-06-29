package onlineStore;

public class WrongLogin extends Exception{
    public WrongLogin(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLogin{} " + super.toString();
    }
}
