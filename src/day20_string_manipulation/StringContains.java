package day20_string_manipulation;

public class StringContains {
    public static void main (String[] args){
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("One"));

        if (company.contains(" ")){
            System.out.println("multiple word company name");
        }else {
            System.out.println("single word company name");
        }
        String firstName = "Mesut";
        if (firstName.contains("e") && firstName.contains("u")){
            System.out.println("Both e and u are present");
        }else {
            System.out.println("e or u not present");
        }

        String email = "BASGOL1983@GMAIL.COM";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email address");
        }else {
            System.out.println("invalid email address");
        }
        if (email.toLowerCase().contains("b")){
            System.out.println("b is present");
        }else {
            System.out.println("b is not present");
        }


    }
}
