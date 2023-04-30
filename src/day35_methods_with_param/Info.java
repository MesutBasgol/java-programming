package day35_methods_with_param;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name = " + fullName());
        System.out.println("is Married = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("Birth year = " + getRandomYear());
    }
    public static String fullName() {
        return "Mike Smith";
    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        int age = 35;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2023);
        return randomYear;
    }

}
