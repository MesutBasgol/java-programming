package day31_arrays;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("nums1 == nums2 - " + Arrays.equals(nums1,nums2));
        System.out.println(nums1 == nums2); // gives false

        if (Arrays.equals(nums1,nums2)){
            System.out.println("nums1 and nums2 match");
        }else {
            System.out.println("nums1 and nums2 mismatch");
        }
        if (Arrays.equals(nums2,nums3)){
            System.out.println("nums2 and nums3 match");
        }else {
            System.out.println("nums2 and nums3 mismatch");
        }
        if (Arrays.equals(cars1,cars2)){
            System.out.println("cars1 and cars2 match");
        }else {
            System.out.println("cars1 and cars2 mismatch");
        }
        System.out.println("cars2 == cars3 --> " + Arrays.equals(cars2,cars3));
        if (Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("cars2 == cars3 match -ignorecase");
        }
    }
}
