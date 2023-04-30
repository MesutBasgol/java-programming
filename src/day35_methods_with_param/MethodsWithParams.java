package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        greetByName("Mesut");
        displayValue(10);
        displayValue(235);
        displaySum(15,25);
        printAge(1983);
        printAge(1995);
        int birthYear = 2001;
        printAge(birthYear);
    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);
    }
    public static void displaySum(int num1, int num2){
        System.out.println("Sum of numbers= "+(num1+num2));
    }
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
    public static void printAge (int year){
        System.out.println("Birth year: " + year + ". Age: "+ (2023-year));
    }
}
