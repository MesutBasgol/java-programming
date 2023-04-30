package day35_methods_with_param;

import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);
        showSum(25.3, 35.9);
    }
    public static void showSum (double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
    }
}
