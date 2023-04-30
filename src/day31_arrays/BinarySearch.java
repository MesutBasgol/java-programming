package day31_arrays;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421, 1};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 25));
        System.out.println(Arrays.binarySearch(nums, 700));
        System.out.println(Arrays.binarySearch(nums, -5));
        System.out.println(Arrays.binarySearch(nums, 1));

        if (Arrays.binarySearch(nums, 123) >=0){
            System.out.println("123 is present in Array");
        }else {
            System.out.println("123 is not present in Array");
        }
    }
}
