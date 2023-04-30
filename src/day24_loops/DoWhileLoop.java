package day24_loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollars = 0;
        do {
            System.out.println("Give me 5 dollars");
            dollars = scan.nextInt();
        }while (dollars != 5);
        System.out.println("Thank you for giving 5 dollars");
    }
}
