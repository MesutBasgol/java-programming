package day21_string_manipulation2;
import java.util.Scanner;
public class StringCharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scan.nextLine();
        System.out.println(word + " has " + word.length() + " characters");
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        System.out.println(word.charAt(0) + " " + word.charAt(1) + " " +
                word.charAt(2) + " " + word.charAt(3));
        String withSpaces = word.charAt(0) + " " + word.charAt(1) + " " +
                word.charAt(2) + " " + word.charAt(3);
        System.out.println("withSpaces = " + withSpaces);

        String word2 = "mom";
        char first = word2.charAt(0);
        char last = word2.charAt(word2.length()-1);

        if (first == last){
            System.out.println("first and last letters of " + word2 + " match");
        }else {
            System.out.println("first and last letters of " + word2 + " mismatch");
        }

    }
        }
