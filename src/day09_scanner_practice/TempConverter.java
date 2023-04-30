package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        System.out.println("######## F to C Converter ###########");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        double fahrenheit = scan.nextDouble();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " F = " + celcius + " C");

    }
}
