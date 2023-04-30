package day35_methods_with_param;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5 , 20));

        double sum = add(3.8 , 24.2);
        System.out.println("sum = " + sum);

        System.out.println("100 + 200 = " + add(100 , 200));

        System.out.println(minus(35.5 , 22.3));

        System.out.println(multiply(2 , 10));

        System.out.println(divide(35 , 5));
    }
    public static double add (double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static double minus (double num1, double num2) {
        return num1 - num2; // this is also possible
    }
    public static double multiply (double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide (double num1 , double num2) {
        double result = num1 / num2;
        return result;
    }

}
