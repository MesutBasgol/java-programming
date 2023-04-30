package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        String city="Istanbul";
        System.out.println(jobTitle.isEmpty());
        System.out.println(city.isEmpty());
        String veggie = "carrots";
        if (!veggie.isEmpty()){
            System.out.println("We have " + veggie);
        }
    }
}
