package day35_methods_with_param;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 15 + 25 = " + Calculator.add(15 , 25));
        System.out.println("100 - 40 = " + Calculator.minus(100 , 40));
        System.out.println("55 / 4 = " + Calculator.divide(55 , 4));
        System.out.println("10 * 2 = " + Calculator.multiply(10 , 2));

        double d1 = 325.65;
        double d2 = 235.56;
        double result = Calculator.minus(d1, d2);
        System.out.println(d1 + " - " + d2 + " = " + result);
    }
}
