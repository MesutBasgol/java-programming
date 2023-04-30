package day09_scanner_practice;
import java.util.Scanner;
public class MilesToKmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mile:");
        double mile = scan.nextInt();
        double km = mile * 1.609344;
        System.out.println(mile + " mile = " + km + "km");
    }
}
