package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        //List<Integer> nums = new ArrayList<>();
        //nums.add(2); nums.add(3); nums.add(4);
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4));
        //List<Integer> nums = Arrays.asList(2,3,4);
        System.out.println(sumIntegerList(nums));
    }
    public static void printStrList(List<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer> integerList) {
        int count =0;
        for (int nums : integerList){
            count += nums;
        }
        return count;
    }
}
