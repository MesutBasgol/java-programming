package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk:");
        double milkPrice = scan.nextDouble();
        System.out.println("Enter price for bread:");
        double breadPrice = scan.nextDouble();
        System.out.println("Enter price for cucumbers:");
        double cucumberPrice = scan.nextDouble();
        double totalPrice = milkPrice + breadPrice + cucumberPrice;
        System.out.println("Total price: $5" + totalPrice);
    }
}
