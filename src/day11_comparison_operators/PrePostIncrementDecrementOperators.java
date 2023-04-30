package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 1;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1);
        int num2 = 5;
        num2--;
        --num2;
        System.out.println("num2 = " + num2);

        int num3 = 4;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        float a = 1232342345561212233313f;
        long b = (long)a; // works but produces irrelevant number
        System.out.println("b = " + b);
    }
}
