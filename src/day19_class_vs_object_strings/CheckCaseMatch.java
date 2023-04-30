package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "Usa";
        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass - case is correct");
        }else {
            System.out.println("Fail - case is incorrect");
        }
    }
}
