package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 5;
        if (number < 0){
            System.out.println(number + " is negative");
        } else if (number > 0) {
            System.out.println(number + " is positive");
        }else {
            System.out.println("it is "+ number);
        }

        }
    }
