package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
         String[][] users = new String[3][2];
         users[0][0] = "Mesut BASGOL";
         users[0][1] = "Asderedf562";
         users[1][0] = "Nesli BASGOL";
         users[1][1] = "dsfaASDa54";
         users[2][0] = "Ahmet Dursun";
         users[2][1] = "Adsferes55";

         String[][] userData = { {"Mesut BASGOL", "Asderedf562"},
                                 {"Nesli BASGOL", "dsfaASDa54"},
                                 {"Ahmet Dursun", "Adsferes55"}
         };
        System.out.println(users[0][0]);
        System.out.println(users[0][1]);
        System.out.println(Arrays.deepToString(userData));

    }
}
