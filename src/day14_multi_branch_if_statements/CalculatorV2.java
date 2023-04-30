package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**** CALCULATOR ****");
        System.out.println("1- Addition\n2- Subtraction\n3- Division\n4- Multiplication\n5- Remainder");
        System.out.print("Enter the operation number: ");
        char numberOfOperation = input.next().charAt(0);
        System.out.println("Enter two numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        String operationName = "";
        double result = 0;
        if (numberOfOperation == '1') {
            operationName = "Addition";
            result = num1 + num2;
        } else if (numberOfOperation == '2') {
            operationName = "Subtraction";
            result = num1 - num2;
        } else if (numberOfOperation == '3') {
            operationName = "Division";
            result = num1 / num2;
        } else if (numberOfOperation == '4') {
            operationName = "Multiplication";
            result = num1 * num2;
        } else if (numberOfOperation == '5') {
            operationName = "Remainder";
            result = num1 % num2;
        }else {
            System.out.println("invalid operator");
    }
        System.out.println("Result of the " + operationName + " is= " + result);
}
}
