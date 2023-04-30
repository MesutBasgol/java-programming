package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        //nums.add(100); gives ERROR
        //nums.remove(0); gives ERROR - Immutable list
        //System.out.println("nums = " + nums);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(23, 1, 34, 54, 654, 741, 555));

        nums2.add(100);
        nums2.add(5);
        nums2.remove(0);
        nums2.remove(new Integer(54));
        System.out.println("nums2 = " + nums2);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew","kambucha", "celsius"));
        System.out.println("drinksWithCaffeine = " + drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")){
                caffeineAmount = 120;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }
    }
}
