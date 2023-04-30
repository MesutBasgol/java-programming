package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajavaa"; // it doesn't work properly in such case
        System.out.println("word = " + word);
        String[] array = word.split("a");
        //System.out.println("length of the array:" + array.length);
        int countOf = array.length-1;
        if (word.endsWith("a")){
            countOf++;
        }
        System.out.println("count of 'a' = " + countOf);
        //System.out.println(Arrays.toString(array));
        System.out.println("---SPLIT WITH EMPTY STRING---");
        String[] strArr = word.split(""); // strArr ==> {"j", "a", "v", "a"}
        System.out.println(Arrays.toString(strArr));

        String word2 = "java1html2sql3js4C++";
        String[] strArr2 = word2.split("\\d"); //REGULAR EXPRESSION - regEx
        System.out.println(Arrays.toString(strArr2));

        String word3 ="123A321D234E23";
        String[] strArr3 = word3.split("[A-Z]");//REGULAR EXPRESSION - regEx
        System.out.println(Arrays.toString(strArr3));

        String word4 ="123a321b234e23";
        String[] strArr4 = word4.split("[a-z]");//REGULAR EXPRESSION - regEx
        System.out.println(Arrays.toString(strArr4));

    }
}
