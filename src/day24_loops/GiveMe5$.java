package day24_loops;
import java.util.Scanner;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me 5 dollars");
        int input = scan.nextInt();
        while (input != 5){
            System.out.println("Give me 5 dollars");
            input = scan.nextInt();
        }
        System.out.println("Thank you for giving 5 dollars");
    }
}
