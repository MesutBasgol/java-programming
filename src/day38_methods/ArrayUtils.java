package day38_methods;

public class ArrayUtils {
    public static void printArray (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int sum (int[] nums){
        int sumNums = 0;
        for (int i : nums) {
            sumNums+=i;
        }
        return sumNums;
    }

    public static boolean contains (int[]nums, int num){
        for (int i : nums){
            if (i == num){
                return true;
            }
        }
        return false;
    }

    public static boolean same (int[]nums1, int[]nums2){
        boolean same = true;
        for (int i=0; i< nums1.length; i++){
            if (nums1[i] != nums2[i]){
                same = false;
                break;
            }
        }
        return same;
    }
}
