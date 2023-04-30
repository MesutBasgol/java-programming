package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        System.out.println("Weekly Pay: $" + weeklyPay);
        double monthlyPay = weeklyPay * 52 / 12;
        System.out.println("Monthly Pay: $" + monthlyPay);
        double annualPay = monthlyPay * 12;
        System.out.println("Annual Pay: $" + annualPay);
    }
}
