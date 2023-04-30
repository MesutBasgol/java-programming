package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min. num: " + nums[0]);
        System.out.println("max. num: " + nums[nums.length-1]);

        // reverse sort: Arrays.sort(nums, Collections.reverseOrder());

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
