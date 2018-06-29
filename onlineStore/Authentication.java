package onlineStore;

public class Authentication {


    public static boolean verify(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 && login.length() < 8 ) {
                throw new WrongLogin("\nLogin is not correct");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPassword("\nPassword is not correct.\n");
            }else{
                System.out.println("\nSuccessful authentication");
            }
        } catch (WrongLogin | WrongPassword e) {
            System.out.print(e.getMessage());
            login = null;
            password = null;
            confirmPassword = null;
            return false;
        }finally {
            User user = new User(login,password,confirmPassword);
            System.out.println(user);
        }
        return true;
    }

}
