package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghıjklmnopqrstuvwxyz0123456789_!^+%^%&/()=";
        Random random = new Random();
        String password ="";
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(source.length());
            password += source.charAt(index);
            //System.out.print(source.charAt(index));
        }
        System.out.print("Random password is: " + password);
    }
}
