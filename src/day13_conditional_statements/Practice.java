package day13_conditional_statements;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("**** CALCULATOR ****");
        System.out.println("1- Addition\n2- Subtraction\n3- Division\n4- Multiplication\n5- Remainder\nPress '6' to exit");
        int numberOfOperation;
        do {
        System.out.print("Enter the operation number: ");
        numberOfOperation = input.nextInt();
        switch (numberOfOperation){
            case 1:
                System.out.println("Addition is selected...");
                break;
            case 2:
                System.out.println("Subtraction is selected...");
                break;
            case 3:
                System.out.println("Division is selected...");
                break;
            case 4:
                System.out.println("Multiplication is selected...");
                break;
            case 5:
                System.out.println("Remainder  is selected...");
                break;
            default:
        }
        if (numberOfOperation == 6){
            System.out.println("Thank you for using Calculator Program");
            System.out.println("Program is ending...");
            Thread.sleep(1000);

            break;
        }
        if (numberOfOperation <1 || numberOfOperation > 6) { // OR OPERATOR
            System.out.println("Enter valid operation number");
        } else {
            System.out.println("Enter two numbers:");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            String operationName = "";
            double result = 0;
            if (numberOfOperation == 1) {
                operationName = "Addition";
                result = num1 + num2;
            } else if (numberOfOperation == 2) {
                operationName = "Subtraction";
                result = num1 - num2;
            } else if (numberOfOperation == 3) {
                operationName = "Division";
                result = num1 / num2;
            } else if (numberOfOperation == 4) {
                operationName = "Multiplication";
                result = num1 * num2;
            } else if (numberOfOperation == 5) {
                operationName = "Remainder";
                result = num1 % num2;
            }
            System.out.println("Result of the " + operationName + " is= " + result);
        }
        } while (numberOfOperation != 6);
    }
}
