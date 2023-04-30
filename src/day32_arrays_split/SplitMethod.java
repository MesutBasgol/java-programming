package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);

        for (String items: wordsArray) {
            System.out.println(items);
        }

        String sentence = "today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("sentence '" + sentence + "' has: " + sentenceArray.length + " words.");
        System.out.println("first word: " + sentence.split(" ")[0]);
    }
}
