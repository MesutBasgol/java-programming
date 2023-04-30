package day32_arrays_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = catTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length - 1));

        int count= 0;
        String[] catsArray2 = catTypes.split(" ");
        for (String each: catsArray2) {
            if (each.equals("cat")){
                count++;
            }
        }
        System.out.println("number of cats = " + count);
    }
}
