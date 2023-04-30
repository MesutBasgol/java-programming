package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase());

        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        String city2 = "ISTANBUL";
        System.out.println(city2.substring(0,1).toUpperCase()+city2.substring(1).toLowerCase());
    }
}
