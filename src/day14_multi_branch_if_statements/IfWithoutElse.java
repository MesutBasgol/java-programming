package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020) {
            System.out.println("Year " + year);
            System.out.println("Covid 19 pandemic year");
            System.out.println("Wear mask, and keep 6 feet distance");
        }
        String country = "USA";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital...");
            System.out.println("White house is on Pennsylvania avenue");
        }
        System.out.println("Welcome to the " + country);
    }
}
