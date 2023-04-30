package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; // single variable
        int[] nums = new int[3]; // array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        System.out.println("number of elements = " + nums.length);

        int len = nums.length;
        System.out.println("len = " + len);

        nums[0] = 100;
        nums[1] = 200;
        nums[2] = nums[0];

        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int[] nums2 = {234,524,578,25,36,85};
        System.out.println("size of nums2 array = " + nums2.length);
    }
}
