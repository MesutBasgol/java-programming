package day33_arrays;

public class MultiDIntArray {
    public static void main(String[] args) {
        int[][] nums2D = {  {12, 35, 65, 8},
                            {25, 5, 99},
                            {56, 36, 58, 855, 461},
                            {15, 26, 250, 35}
        };
        for (int i = 0; i < nums2D.length; i++){
            for (int j = 0; j < nums2D[i].length; j++){
                System.out.println(nums2D[i][j]);
            }
        }

    }

}
