package day11_comparison_operators;
import java.util.Scanner;
public class SecondsConverter {
    public static void main (String [] args){
        int inputSeconds1, inputSeconds2, hours, minutes, seconds;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter seconds:");
        inputSeconds1 = scan.nextInt();
        inputSeconds2 = inputSeconds1;
        hours = inputSeconds2 / 3600;
        inputSeconds2 %= 3600;
        minutes = inputSeconds2 / 60;
        seconds = inputSeconds2 %=60;

        System.out.println(inputSeconds1 + " seconds= " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

    }
}