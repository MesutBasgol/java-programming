package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {25, 65, 5, 3, 1, 584};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{56,65,3,2,1,45,89});

        int[] nums2 = {5, 2, 6, 7, 2};
        int sum= ArrayUtils.sum(nums2);
        System.out.println("sum = " + sum);
        System.out.println(ArrayUtils.contains(nums, 2));
        System.out.println(ArrayUtils.contains(nums2, 2));

        int[] nums3 = {5, 2, 6, 7, 2};
        System.out.println("same = " + ArrayUtils.same(nums2,nums3));
        System.out.println("same = " + ArrayUtils.same(nums2,nums));
    }
}
