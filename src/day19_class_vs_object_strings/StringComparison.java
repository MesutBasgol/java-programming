package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //equals() method/action/behaviour - Case Sensitive Comparison
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("CHICAGO"));
        //equalsIgnoreCase() method/action/behaviour - Case Insensitive Comparison
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
    }
}
