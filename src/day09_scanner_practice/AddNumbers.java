package day09_scanner_practice;

import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // both scan and input are used
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("Enter 2 numbers:");
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int result2 = num3 + num4;
        System.out.println(num3 + " + " + num4 + " = " + result2);
    }
}
