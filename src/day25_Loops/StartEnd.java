package day25_Loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter star and end numbers");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start>end){
            System.out.println("Reverse printing is not supported");
        }
        for (int i= start; i<=end; i++){
          System.out.print(i + " ");
        }
    }
}
