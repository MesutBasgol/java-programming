package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Mesut";
        System.out.println(name + " has " + name.length() + " characters");
        int count = name.length();
        System.out.println("count = " + count);

        String password = "abc12";
        if (password.length() >= 6){
            System.out.println("valid amazon password");
        }else {
            System.out.println("password must be at least 6 characters");
        }
    }
}
