package day24_loops;
import java.util.Scanner;
public class LoopWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktöryelini bulmak istediğiniz sayıyı girin:");
        int sayi1 = scan.nextInt();
        int sayi = sayi1;
        int faktoriyel = sayi;
        while (sayi > 1){
        faktoriyel = faktoriyel * (sayi-1);
        sayi--;
        }
        System.out.println(sayi1 + " faktöriyel = " + faktoriyel);
    }
}
