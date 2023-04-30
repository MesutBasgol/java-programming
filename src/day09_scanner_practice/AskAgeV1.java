package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // if you put input instead of scan then you should change following scan
        System.out.println("What's your name?");
        String name = scan.next(); // next() is for one word
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println(name + ", " + age + " is a great age!");
        //scan.close(); optionally you can close the scanner.
    }
}
