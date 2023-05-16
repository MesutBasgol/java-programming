package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5, 3);
        //Calculator.multiply(12, 4); - ERROR since not static
        Calculator calcObject = new Calculator();
        calcObject.multiply(12, 4);
    }
}
