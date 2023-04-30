package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents:");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println(cents + " cents = " + dollars + " dollars and " + remainingCents + " cents.");

    }

}
