package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "cybertek";
        String password = "Abc123";
        if (userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
            return;
        }
        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Login successful");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Incorrect Username");
            } else {
                System.out.println("Incorrect Password");
            }
        }
    }

}
