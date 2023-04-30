package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(25,36,62,35,56);
        addNumbers();
        addNumbers(100,200,500,36,32,36,65,34,38,25,36,33,32,33,321,25);
    }
    public static void addNumbers (int... nums){
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
