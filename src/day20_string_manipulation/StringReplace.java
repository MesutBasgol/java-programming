package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String word = "java";

        System.out.println("word = " + word.replace("a","u"));

        String sentence = "Java strings are fun";
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.indexOf("a"));
    }
}
