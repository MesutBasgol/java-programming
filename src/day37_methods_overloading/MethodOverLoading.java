package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        sum(25, 35);
        sum(24 , 3.5);
        sum(15, 56, 65);
        sum("Ali", "Veli");

    }
    public static void sum (int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public static void sum (double a, double b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public static void sum (int a, int b, int c){
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
    }
    public static void sum (String a, String b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public static int sum (int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
